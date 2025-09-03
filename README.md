# ChestSorter (Fabric 1.21)
A Fabric mod for Maincraft 1.21 - currently a blank template, ready for implementation.

## Status
This is a development scaffold. The mod loads into Minecraft and logs a message on startup, but no sorting logic has been implemented yet.

## Requirements
- Minecraft **1.21**
- Fabric Loader **0.15.11** or newer
- Fabric API **0.100.7+1.21**
- Java **21.0.8**
- Gradle **8.10.2** (via Gradle Wrapper)

## Development Setup
1. Clone this repository.
2. Open the project in VSCode (with the Java Extension Pack installed).
3. In a terminal, run:
   ```bash
   ./gradlew genSources
   ./gradlew runClient
   ```

## Current Features
- Loads into Minecraft 1.21 with Fabric Loader.
- Logs "Chest Sorter initialized" to the console.

## Planned Features
- Sort chest inventories by item type, name, or custom rules.
- Merge partial stacks automatically.
- Support for multiple container types (chests, barrels, shulkers).
- Optional GUI button and/or keybind to trigger sorting.

## License
MIT License — see [LICENSE](LICENSE) for details.
