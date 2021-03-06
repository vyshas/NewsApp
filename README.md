## Android Components Architecture in a Modular Word
[![License](https://img.shields.io/badge/License-Apache%202.0-lightgrey.svg)](http://www.apache.org/licenses/LICENSE-2.0)

<img src="screenshots/demo/demo.gif" width="250" align="right" hspace="20">


### Environment setup

First off, you require the latest Android Studio 4.2.0 (or newer) to be able to build the app.

You need to supply keys for News API. You can find information about how to gain access by using the [link](https://newsapi.org/).

When you obtain the keys, you can provide them to the app by putting the following in the `local.properties` project root file:

```properties
#News API KEYS
news.key.public = <insert>
```

## Architecture

The architecture of the application is based, apply and strictly complies with each of the following 5 points:

<img src="screenshots/architecture/project_structure.png" width="300" align="right" hspace="20">

-   A single-activity architecture, using the [Navigation component](https://developer.android.com/guide/navigation/navigation-getting-started) to manage fragment operations.
-   [Android architecture components](https://developer.android.com/topic/libraries/architecture/), part of Android Jetpack for give to project a robust design, testable and maintainable.
-   Pattern [Model-View-ViewModel](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel) (MVVM) facilitating a [separation](https://en.wikipedia.org/wiki/Separation_of_concerns) of development of the graphical user interface.
-   [S.O.L.I.D](https://en.wikipedia.org/wiki/SOLID) design principles intended to make software designs more understandable, flexible and maintainable.
-   [Modular app architecture](https://proandroiddev.com/build-a-modular-android-app-architecture-25342d99de82) allows to be developed features in isolation, independently from other features.

## Documentation

The documentation is generated following [KDoc](https://kotlinlang.org/docs/reference/kotlin-doc.html) language (the equivalent of Java's [JavaDoc](https://en.wikipedia.org/wiki/Javadoc)) via documentation engine for Kotlin [Dokka](https://github.com/Kotlin/dokka).

## Tech-stack

This project takes advantage of many popular libraries, plugins and tools of the Android ecosystem. Most of the libraries are in the stable version, unless there is a good reason to use non-stable dependency.