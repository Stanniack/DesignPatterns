package facade;

public class SystemFacade {

    private Audio audio;
    private Video video;
    private Input input;

    public void configuraSistema() {
        audio = new Audio();
        video = new Video();
        input = new Input();

        /* Configura sistema */
        audio.conSequencia();
        audio.confCanais();
        audio.confVolumn();

        video.confCores();
        video.confResolucao();

        input.confMouse();
        input.confTeclado();
    }
}
