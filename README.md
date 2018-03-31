# gsynj

A Clojure library to watch for file/directory changes and copies updated file to various cloud-based targets.

Available targets can be found on [rclone](https://rclone.org) site.

## Initial Setup
1. Follow the [rclone installation instructions](https://rclone.org/install/);
2. Setup cloud service (currently only tested with
   [Google Drive](https://rclone.org/drive/)).

## Usage

Currently very much WIP, though running ```(gsynj.core/watch-file)``` at the
REPL will set up a watch on the file ```/path/to/sync.me```, uploading to an
established rclone target called ```gdrive``` in the folder ```/target/path```.

## Plans
* Add ability to watch multiple files/directories
* Allow different targets for different watched files

## License

Copyright © 2018 Dan Picton

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
