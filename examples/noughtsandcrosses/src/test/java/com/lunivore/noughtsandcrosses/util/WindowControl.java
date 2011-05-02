package com.lunivore.noughtsandcrosses.util;

import org.uispec4j.Trigger;
import org.uispec4j.UISpec4J;
import org.uispec4j.Window;
import org.uispec4j.interception.WindowInterceptor;

import com.lunivore.noughtsandcrosses.NoughtsAndCrosses;

public class WindowControl {

    private Window window;

    public WindowControl() {
        UISpec4J.init();
        reset();
    }

    public Window getWindow() {
        return window;
    }

    public void reset() {
        window = WindowInterceptor.run(new Trigger() {
            public void run() {
                NoughtsAndCrosses.main(new String[0]);
            }
        });
    }

    public void destroy() {
        window.dispose();
    }
}
