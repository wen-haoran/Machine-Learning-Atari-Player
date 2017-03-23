import gym
env = gym.make('MountainCar-v0')

for i_episode in range(100):
    observation = env.reset()
    for t in range(100):
        env.render()
        print(observation)
        action = env.action_space.sample()
        observation, revward, done, info,=env.step(action)
        if done:
            print("episode finished after {} timesteps")
            break
m
