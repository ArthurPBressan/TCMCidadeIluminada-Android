package br.com.bilac.tcm.cidadeiluminada;

/**
 * Created by arthur on 22/03/15.
 */
public final class Constants {
    public static final int CAMERA_REQUEST_CODE = 1;
    public static final int PLACE_PICKER_REQUEST_CODE = 2;

    public static final String PACKAGE = "br.com.bilac.tcm.cidadeiluminada";
    public static final String KEY_FILE_URI = PACKAGE + ".FILE_URI";

    public static final String CIDADEILUMINADA_HOST_DEBUG = "http://localhost:5000";
    public static final String CIDADEILUMINADA_HOST_PROD = "http://\uD83D\uDCA9:5000";

    public static final String PHOTO_EXTENSION = ".jpg";
    public static final String JPG_MIME_TYPE = "image/jpeg";

    public static final String CEP_PREFERENCE_KEY = "preference_cep";
    public static final String NOME_PREFERENCE_KEY = "preference_nome";
    public static final String EMAIL_PREFERENCE_KEY = "preference_email";
}
