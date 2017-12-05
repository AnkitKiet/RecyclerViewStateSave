# RecyclerViewStateSave
A simple Android app to demonstrate how to save state of layouts components in Recycler view. RecyclerView decomposes the views and creates a new one everytime. So, the layouts looses their state and hence generate a random behaviour.
A solution, to the above problem is to save the state of every layout component and check in onBindViewHolder. I have used ArrayList, you can try with HashMap or HashSet is preferred. Since the index of layout components need to be unique. You can use any of the above preferred DataStructure.
