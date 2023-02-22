package utils;

public enum UrlAplicativos {

    IMPLICITA_DYNAMIC_PROPERTIES("https://demoqa.com/dynamic-properties"),
    EXPLICITA_DYNAMIC_CONTROLS("https://the-internet.herokuapp.com/dynamic_controls"),
    EXPLICITA_DYNAMIC_LOADING("https://the-internet.herokuapp.com/dynamic_loading/2"),
    FLUIDA_SPINNER_CARGA("https://www.magentaa11y.com/demos/spinner/"),
    ASINCRONICA_IMAGE_SPINNER("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/overview/defaultvb.aspx?skin=Material"),
    SCREENPLAY_COSMO_CODE("https://cosmocode.io/automation-practice-handling-waits/")
    ;


    private final String valor;
    UrlAplicativos(String valor) {
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }
}
