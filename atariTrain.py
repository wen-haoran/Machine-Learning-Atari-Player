import time
import tensorflow as tf

class Trainer:
    def __init__(self, agent):
        self.agent = agent
        self.env = agent.env
        self.saver = tf.train.Saver()

    def run(self):
        with tf.Session() as sess:
            sess.run(tf.initialize_all_variables())
            self.agent.randomRestart()

            successes = 0
            failures = 0
            total_loss = 0

           for i in xrange(self.agent.replay_start_size):
                 state, action, reward, next_state, terminal = self.agent.observe(1)
                if reward == 1:
                    successes += 1
                elif terminal:
                    failures += 1
                if (i+1) % 10000 == 0:
                    print len(self.agent.memory), successes,failures
            
            sample_success = 0
            sample_failure = 0
            start_time = time.time()
            for i in xrange(self.agent.train_steps):
