package org.example._2024_02_05;

public interface Cars {
    void start();
    void stop();
}

class Controller implements Cars {

    @Override
    public void start() {
        System.out.println("Controller start()");
    }

    @Override
    public void stop() {
        System.out.println("Controller stop()");
    }
}

class ControllerProxy implements Cars {
    private Controller controller;

    public ControllerProxy(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void start() {
        System.out.println("***ControllerProxy***   start()");
        controller.start();
    }

    @Override
    public void stop() {
        System.out.println("***ControllerProxy***   stop()");
        controller.stop();
    }

    public static void main(String[] args) {
        Controller controller1 = new Controller();
        ControllerProxy controllerProxy = new ControllerProxy(controller1);

        controllerProxy.start();
        controllerProxy.stop();
    }
}

