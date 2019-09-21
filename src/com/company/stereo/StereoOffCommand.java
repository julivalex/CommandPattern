package com.company.stereo;

import com.company.Command;

public class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.setVolume(11);
        stereo.setCd();
        stereo.on();
    }
}