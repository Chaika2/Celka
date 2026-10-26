/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fJ_2;
import celestial.rqR_2;
import celestial.rqi_3;
import celestial.rrbb_3;
import celestial.rrdX;
import celestial.rrdY;
import celestial.rrdZ;
import celestial.rrdr_1;
import java.util.ArrayList;
import java.util.Arrays;

public class rrdo_1 {
    private static String id_abstract = "MC_";
    public static final String id_class = "MC_VERSION";
    public static final String id_break = "MC_GL_VERSION";
    public static final String id_byte = "MC_GLSL_VERSION";
    public static final String id_protected = "MC_OS_WINDOWS";
    public static final String id_throws = "MC_OS_MAC";
    public static final String id_case = "MC_OS_LINUX";
    public static final String id_catch = "MC_OS_OTHER";
    public static final String id_private = "MC_GL_VENDOR_AMD";
    public static final String id_implements = "MC_GL_VENDOR_ATI";
    public static final String id_finally = "MC_GL_VENDOR_INTEL";
    public static final String id_extends = "MC_GL_VENDOR_MESA";
    public static final String id_native = "MC_GL_VENDOR_NVIDIA";
    public static final String id_volatile = "MC_GL_VENDOR_XORG";
    public static final String id_final = "MC_GL_VENDOR_OTHER";
    public static final String id_package = "MC_GL_RENDERER_RADEON";
    public static final String id_int = "MC_GL_RENDERER_GEFORCE";
    public static final String id_new = "MC_GL_RENDERER_QUADRO";
    public static final String id_continue = "MC_GL_RENDERER_INTEL";
    public static final String id_super = "MC_GL_RENDERER_GALLIUM";
    public static final String id_this = "MC_GL_RENDERER_MESA";
    public static final String id_else = "MC_GL_RENDERER_OTHER";
    public static final String id_synchronized = "MC_FXAA_LEVEL";
    public static final String id_return = "MC_NORMAL_MAP";
    public static final String id_public = "MC_SPECULAR_MAP";
    public static final String id_goto = "MC_RENDER_QUALITY";
    public static final String id_while = "MC_SHADOW_QUALITY";
    public static final String id_try = "MC_HAND_DEPTH";
    public static final String id_instanceof = "MC_OLD_HAND_LIGHT";
    public static final String id_throw = "MC_OLD_LIGHTING";
    public static final String id_interface = "MC_ANISOTROPIC_FILTERING";
    public static final String id_char = "MC_TEXTURE_FORMAT_";
    private static rrdY[] id_long;
    private static rrdY[] id_float;

    public static String id_byte() {
        String string = rrbb_3.id_catch;
        if (string == null) {
            return id_else;
        }
        if ((string = string.toLowerCase()).startsWith("amd")) {
            return id_package;
        }
        if (string.startsWith("ati")) {
            return id_package;
        }
        if (string.startsWith("radeon")) {
            return id_package;
        }
        if (string.startsWith("gallium")) {
            return id_super;
        }
        if (string.startsWith("intel")) {
            return id_continue;
        }
        if (string.startsWith("geforce")) {
            return id_int;
        }
        if (string.startsWith("nvidia")) {
            return id_int;
        }
        if (string.startsWith("quadro")) {
            return id_new;
        }
        if (string.startsWith("nvs")) {
            return id_new;
        }
        return string.startsWith("mesa") ? id_this : id_else;
    }

    private static void id_class(StringBuilder stringBuilder, String string, int n) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(n);
        stringBuilder.append("\n");
    }

    public static String id_class() {
        rqi_3 rqi_32 = rqR_2.id_implements();
        switch (rqi_32) {
            case WINDOWS: {
                return id_protected;
            }
            case OSX: {
                return id_throws;
            }
            case LINUX: {
                return id_case;
            }
        }
        return id_catch;
    }

    private static void id_class(StringBuilder stringBuilder, String string) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append("\n");
    }

    private static void id_class(StringBuilder stringBuilder, String string, float f) {
        stringBuilder.append("#define ");
        stringBuilder.append(string);
        stringBuilder.append(" ");
        stringBuilder.append(f);
        stringBuilder.append("\n");
    }

    public static String id_break() {
        String string = rrbb_3.id_case;
        if (string != null && string.contains("Mesa")) {
            return id_extends;
        }
        String string2 = rrbb_3.id_private;
        if (string2 == null) {
            return id_final;
        }
        if ((string2 = string2.toLowerCase()).startsWith("amd")) {
            return id_private;
        }
        if (string2.startsWith("ati")) {
            return id_implements;
        }
        if (string2.startsWith("intel")) {
            return id_finally;
        }
        if (string2.startsWith("nvidia")) {
            return id_native;
        }
        return string2.startsWith("x.org") ? id_volatile : id_final;
    }

    public static rrdY[] id_throws() {
        if (id_long == null) {
            String[] stringArray = rrbb_3.id_native();
            rrdY[] rrdYArray = new rrdY[stringArray.length];
            for (int i = 0; i < stringArray.length; ++i) {
                rrdYArray[i] = new rrdY(id_abstract + stringArray[i], "");
            }
            id_long = rrdYArray;
        }
        return id_long;
    }

    public static String[] id_finally() {
        String string = rrdo_1.id_catch() + rrdo_1.id_private() + rrdo_1.id_implements();
        return rrbb_3.id_class(string, "\n\r");
    }

    public static String id_catch() {
        StringBuilder stringBuilder = new StringBuilder();
        rrdo_1.id_class(stringBuilder, id_class, rrbb_3.id_private());
        rrdo_1.id_class(stringBuilder, "MC_GL_VERSION " + rrbb_3.id_finally().id_protected());
        rrdo_1.id_class(stringBuilder, "MC_GLSL_VERSION " + rrbb_3.id_extends().id_protected());
        rrdo_1.id_class(stringBuilder, rrdo_1.id_class());
        rrdo_1.id_class(stringBuilder, rrdo_1.id_break());
        rrdo_1.id_class(stringBuilder, rrdo_1.id_byte());
        return stringBuilder.toString();
    }

    private static rrdY[] id_extends() {
        rrdX[] rrdXArray = rrdX.values();
        rrdY[] rrdYArray = new rrdY[rrdXArray.length];
        for (int i = 0; i < rrdXArray.length; ++i) {
            rrdX rrdX2 = rrdXArray[i];
            rrdYArray[i] = new rrdY(id_abstract + "RENDER_STAGE_" + rrdX2.name(), "" + rrdX2.ordinal());
        }
        return rrdYArray;
    }

    public static rrdY[] id_case() {
        if (id_float == null) {
            ArrayList<rrdY> arrayList = new ArrayList<rrdY>();
            arrayList.addAll(Arrays.asList(rrdo_1.id_extends()));
            id_float = arrayList.toArray(new rrdY[arrayList.size()]);
        }
        return id_float;
    }

    public static String id_implements() {
        fJ_2 fJ_22 = rrbb_3.rF();
        if (fJ_22 == null) {
            return "";
        }
        rrdr_1 rrdr_12 = fJ_22.id_final();
        if (rrdr_12 == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string = rrdr_12.id_class();
        if (string != null) {
            rrdo_1.id_class(stringBuilder, id_char + string);
            String string2 = rrdr_12.id_break();
            if (string2 != null) {
                rrdo_1.id_class(stringBuilder, id_char + string + "_" + string2);
            }
        }
        return stringBuilder.toString();
    }

    public static String id_protected() {
        return id_abstract;
    }

    public static String id_private() {
        StringBuilder stringBuilder = new StringBuilder();
        if (rrdZ.So > 0) {
            rrdo_1.id_class(stringBuilder, id_synchronized, rrdZ.So);
        }
        if (rrdZ.SV) {
            rrdo_1.id_class(stringBuilder, id_return);
        }
        if (rrdZ.Sg) {
            rrdo_1.id_class(stringBuilder, id_public);
        }
        rrdo_1.id_class(stringBuilder, id_goto, rrdZ.Sy);
        rrdo_1.id_class(stringBuilder, id_while, rrdZ.Sp);
        rrdo_1.id_class(stringBuilder, id_try, rrdZ.SH);
        if (rrdZ.id_implements()) {
            rrdo_1.id_class(stringBuilder, id_instanceof);
        }
        if (rrdZ.id_extends()) {
            rrdo_1.id_class(stringBuilder, id_throw);
        }
        if (rrbb_3.p()) {
            rrdo_1.id_class(stringBuilder, id_interface, rrbb_3.y());
        }
        return stringBuilder.toString();
    }
}

