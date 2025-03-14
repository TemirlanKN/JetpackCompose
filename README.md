# Social Media Profile List - Jetpack Compose Demo

## Overview

A modern Android application showcasing Jetpack Compose implementation with an interactive social media profile list interface. The app demonstrates core Compose concepts including state management, reusable components, and material design.

## Features

- Interactive profile cards with expandable text
- Lazy loading list implementation
- Material Design components
- Circular profile images
- Expandable content description
- Responsive layout design
- Custom UI components

## Tech Stack

- Kotlin
- Jetpack Compose 1.0.1
- Android SDK 32
- Gradle 7.1.3
- Material Design Components
- AndroidX Libraries

## Project Structure

```
com.trasty.compose/
├── MainActivity.kt          # Main activity with LazyColumn implementation
├── itemRow.kt              # Reusable profile card component
├── model/
│   └── ItemRowModel.kt     # Data model for profile items
├── ui/theme/
│   ├── Theme.kt           # App theming
│   ├── Color.kt          # Color definitions
│   └── Type.kt           # Typography definitions
└── res/
    ├── drawable/         # Image resources
    └── values/
        └── strings.xml   # String resources
```

## Setup Instructions

1. Clone the repository
2. Open in Android Studio Arctic Fox or later
3. Sync Gradle files
4. Run on emulator or device (minimum SDK 23)

## Implementation Details

### Main Components

#### Profile Card (MyRow)

```kotlin
@Composable
fun MyRow(item: ItemRowModel) {
    // Expandable profile card implementation
    // with image, title, and expandable content
}
```

#### Main List

```kotlin
LazyColumn {
    itemsIndexed(listOf(profiles)) { _, item ->
        MyRow(item = item)
    }
}
```

## Build Configuration

```gradle
android {
    compileSdk 32
    defaultConfig {
        minSdk 23
        targetSdk 32
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion '1.0.1'
    }
}
```

## Dependencies

```gradle
dependencies {
    implementation "androidx.compose.ui:ui:$compose_version"
    implementation "androidx.compose.material:material:$compose_version"
    implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"
    implementation 'androidx.activity:activity-compose:1.3.1'
}
```

## Features Demonstration

- Profile Images: Circular image display with content scaling
- Expandable Text: Click to expand/collapse description
- Smooth Animations: Material design transitions
- Responsive Layout: Adapts to different screen sizes
- State Management: Using `remember` and `mutableStateOf`

## Contribution

1. Fork the repository
2. Create feature branch
3. Commit changes
4. Push to branch
5. Open pull request

## License

[Specify License]

## Author

[Your Name]

## Acknowledgments

- Jetpack Compose documentation
- Material Design guidelines
- Android developer community
