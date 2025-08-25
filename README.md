<img width="1031" height="255" alt="image" src="https://github.com/user-attachments/assets/d7e57d60-fab3-4c5e-9383-d01d9c1014f4" />


You can find the instructions for this lab [here](https://morethanequations.com/Computer-Science/Labs/Well-That's-Just-Prime). Create a new repository on GitHub to house your code. Be sure to make the repository public so that I can view and grade it.

We will use [Gradle](https://gradle.org/) to automate common development tasks.

## Building the App

You can build the app using:

```bash
./gradlew build
```

## Testing the App

You can run the automated suite of tests using:

```bash
./gradlew test
```

## Running the App

You can run the app using:

```bash
./gradlew run --quiet --console=plain
```

The two flags passed to the `run` command hide the noisy output from Gradle. You can see the details from Gradle by omitting those flags.
