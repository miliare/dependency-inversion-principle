package fr.xebia.controls;

import fr.xebia.model.fileexplorer.FileExplorer;

public class FileExplorerControls implements ControlService {

    private FileExplorer fileExplorer;

    public FileExplorerControls(FileExplorer fileExplorer) {
        this.fileExplorer = fileExplorer;
    }

    @Override
    public void up() {
        fileExplorer.moveUp();
    }

    @Override
    public void down() {
        fileExplorer.moveDown();
    }

    @Override
    public void right() {
        fileExplorer.openHighlightedDirectory();
    }

    @Override
    public void left() {
        fileExplorer.moveToParentDirectory();
    }
}
