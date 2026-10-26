/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.jI_2;
import celestial.rgN_2;
import celestial.rqR_2;
import celestial.rrJM;
import celestial.rrJX;
import celestial.rrJx_1;
import celestial.rrXi_1;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.rrdA;
import celestial.rrdZ;
import celestial.rrdy_1;
import celestial.rrkJ;
import celestial.rrkM;
import celestial.rrkO;
import celestial.rrkW;
import celestial.vm_3;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class rrkx_1
extends rrJM {
    protected vm_3 id_class;
    private rrJX id_return = new rrJX(this, new rrJx_1());
    private int id_public = -1;
    private rrkW id_goto;
    private boolean id_while = false;
    private static float[] id_try = new float[]{0.5f, 0.6f, 0.6666667f, 0.75f, 0.8333333f, 0.9f, 1.0f, 1.1666666f, 1.3333334f, 1.5f, 1.6666666f, 1.8f, 2.0f};
    private static String[] id_instanceof = new String[]{"0.5x", "0.6x", "0.66x", "0.75x", "0.83x", "0.9x", "1x", "1.16x", "1.33x", "1.5x", "1.66x", "1.8x", "2x"};
    private static float id_throw = 1.0f;
    private static float[] id_interface = new float[]{0.0625f, 0.125f, 0.25f};
    private static String[] id_char = new String[]{"0.5x", "1x", "2x"};
    private static float id_abstract = 0.125f;
    public static final int id_private = 0;
    public static final int id_implements = 1;
    public static final int id_finally = 2;
    public static final int id_else = 3;
    public static final int id_synchronized = 4;

    @Override
    protected void id_byte(LZ lZ) {
        this.id_class(lZ, true);
    }

    public static String id_byte(boolean bl) {
        String string = rrba_3.id_break();
        String string2 = rrba_3.id_byte();
        return bl ? string : string2;
    }

    public rrkx_1(vm_3 vm_32, Qw_1 qw_1) {
        super(new rgN_2(jI_2.id_class("of.options.shadersTitle", new Object[0])));
        this.id_class = vm_32;
    }

    public static String id_class(float f, float[] fArray, String[] stringArray) {
        int n = rrkx_1.id_class(f, fArray);
        return stringArray[n];
    }

    public static String id_class(float f) {
        return rrkx_1.id_class(f, id_try, id_instanceof);
    }

    public static int id_class(float f, float[] fArray) {
        for (int i = 0; i < fArray.length; ++i) {
            float f2 = fArray[i];
            if (!(f2 >= f)) continue;
            return i;
        }
        return fArray.length - 1;
    }

    private float id_class(float f, float[] fArray, float f2, boolean bl, boolean bl2) {
        if (bl2) {
            return f2;
        }
        int n = rrkx_1.id_class(f, fArray);
        if (bl) {
            if (++n >= fArray.length) {
                n = 0;
            }
        } else if (--n < 0) {
            n = fArray.length - 1;
        }
        return fArray[n];
    }

    public void id_class(Ml_1 ml_1, String string, int n, int n2, int n3) {
        rrkx_1.id_class(ml_1, this.id_case, string, n, n2, n3);
    }

    private void id_class(LZ lZ, boolean bl) {
        if (lZ.id_int) {
            if (lZ instanceof rrkO) {
                rrkO rrkO2 = (rrkO)lZ;
                switch (rrkO2.id_private()) {
                    case ANTIALIASING: {
                        rrdZ.id_class(!bl);
                        if (rrkx_1.id_synchronized()) {
                            rrdZ.So = 0;
                        }
                        rrdZ.id_while();
                        break;
                    }
                    case NORMAL_MAP: {
                        boolean bl2 = rrdZ.SV = !rrdZ.SV;
                        if (rrkx_1.id_synchronized()) {
                            rrdZ.SV = true;
                        }
                        rrdZ.id_while();
                        this.id_volatile.x();
                        break;
                    }
                    case SPECULAR_MAP: {
                        boolean bl3 = rrdZ.Sg = !rrdZ.Sg;
                        if (rrkx_1.id_synchronized()) {
                            rrdZ.Sg = true;
                        }
                        rrdZ.id_while();
                        this.id_volatile.x();
                        break;
                    }
                    case RENDER_RES_MUL: {
                        rrdZ.Sy = this.id_class(rrdZ.Sy, id_try, id_throw, !bl, rrkx_1.id_synchronized());
                        rrdZ.id_while();
                        rrdZ.id_try();
                        break;
                    }
                    case SHADOW_RES_MUL: {
                        rrdZ.Sp = this.id_class(rrdZ.Sp, id_try, id_throw, !bl, rrkx_1.id_synchronized());
                        rrdZ.id_while();
                        rrdZ.id_instanceof();
                        break;
                    }
                    case HAND_DEPTH_MUL: {
                        rrdZ.SH = this.id_class(rrdZ.SH, id_interface, id_abstract, !bl, rrkx_1.id_synchronized());
                        rrdZ.id_while();
                        break;
                    }
                    case OLD_HAND_LIGHT: {
                        rrdZ.SY.id_class(!bl);
                        if (rrkx_1.id_synchronized()) {
                            rrdZ.SY.id_case();
                        }
                        rrdZ.id_while();
                        break;
                    }
                    case OLD_LIGHTING: {
                        rrdZ.SR.id_class(!bl);
                        if (rrkx_1.id_synchronized()) {
                            rrdZ.SR.id_case();
                        }
                        rrdZ.id_private();
                        rrdZ.id_while();
                        this.id_volatile.x();
                        break;
                    }
                    case TWEAK_BLOCK_DAMAGE: {
                        rrdZ.SC = !rrdZ.SC;
                        break;
                    }
                    case CLOUD_SHADOW: {
                        rrdZ.Sl = !rrdZ.Sl;
                        break;
                    }
                    case TEX_MIN_FIL_B: {
                        rrdZ.ST = rrdZ.St = (rrdZ.Sq = (rrdZ.Sq + 1) % 3);
                        rrkO2.id_class("Tex Min: " + rrdZ.SU[rrdZ.Sq]);
                        rrdA.id_break();
                        break;
                    }
                    case TEX_MAG_FIL_N: {
                        rrdZ.SI = (rrdZ.SI + 1) % 2;
                        rrkO2.id_class("Tex_n Mag: " + rrdZ.Se[rrdZ.SI]);
                        rrdA.id_break();
                        break;
                    }
                    case TEX_MAG_FIL_S: {
                        rrdZ.Sf = (rrdZ.Sf + 1) % 2;
                        rrkO2.id_class("Tex_s Mag: " + rrdZ.Se[rrdZ.Sf]);
                        rrdA.id_break();
                        break;
                    }
                    case SHADOW_CLIP_FRUSTRUM: {
                        rrdZ.Sj = !rrdZ.Sj;
                        rrkO2.id_class("ShadowClipFrustrum: " + rrkx_1.id_byte(rrdZ.Sj));
                        rrdA.id_break();
                    }
                }
                rrkO2.id_implements();
            } else if (!bl && lZ instanceof rrXi_1) {
                rrXi_1 rrXi_12 = (rrXi_1)lZ;
                switch (rrXi_12.id_class) {
                    case 201: {
                        switch (rrkx_1.id_final()) {
                            case 1: {
                                String string = String.format("cmd.exe /C start \"Open file\" \"%s\"", rrdZ.sG.getAbsolutePath());
                                try {
                                    Runtime.getRuntime().exec(string);
                                    return;
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                    break;
                                }
                            }
                            case 2: {
                                try {
                                    Runtime.getRuntime().exec(new String[]{"/usr/bin/open", rrdZ.sG.getAbsolutePath()});
                                    return;
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                }
                            }
                        }
                        boolean bl4 = false;
                        try {
                            URI uRI = new File((File)this.id_volatile.id_class[24], "shaderpacks").toURI();
                            rqR_2.id_implements().id_class(uRI);
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                            bl4 = true;
                        }
                        if (!bl4) break;
                        rrbb_3.id_byte("Opening via system class!");
                        rqR_2.id_implements().id_class("file://" + rrdZ.sG.getAbsolutePath());
                        break;
                    }
                    case 202: {
                        rrdZ.id_break();
                        this.id_while = true;
                        this.id_volatile.id_break(this.id_class);
                        break;
                    }
                    case 203: {
                        rrkJ rrkJ2 = new rrkJ(this, rrbb_3.rE());
                        rrbb_3.X().id_break(rrkJ2);
                    }
                    default: {
                        break;
                    }
                    case 210: {
                        try {
                            URI uRI = new URI("http://optifine.net/shaderPacks");
                            rqR_2.id_implements().id_class(uRI);
                            break;
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_goto.id_class(ml_1, n, n2, f);
        if (this.id_public <= 0) {
            this.id_goto.id_new();
            this.id_public += 20;
        }
        rrkx_1.id_class(ml_1, this.id_case, this.id_extends, this.id_package / 2, 15, 0xFFFFFF);
        String string = "OpenGL: " + rrdZ.id_case + ", " + rrdZ.id_catch + ", " + rrdZ.id_private;
        int n3 = this.id_case.id_break(string);
        if (n3 < this.id_package - 5) {
            rrkx_1.id_class(ml_1, this.id_case, string, this.id_package / 2, this.id_int - 40, 0x808080);
        } else {
            rrkx_1.id_byte(ml_1, this.id_case, string, 5, this.id_int - 40, 0x808080);
        }
        super.id_class(ml_1, n, n2, f);
        this.id_return.id_class(ml_1, n, n2, this.id_throws);
    }

    @Override
    protected void id_break(LZ lZ) {
        this.id_class(lZ, false);
    }

    public static String id_break(float f) {
        return rrkx_1.id_class(f, id_interface, id_char);
    }

    public static String id_break(int n) {
        if (n == 2) {
            return "FXAA 2x";
        }
        return n == 4 ? "FXAA 4x" : rrba_3.id_byte();
    }

    public void id_finally() {
        boolean bl = rrbb_3.rs();
        for (LZ lZ : this.id_throws) {
            if (!(lZ instanceof rrXi_1)) continue;
            rrXi_1 rrXi_12 = (rrXi_1)lZ;
            if (rrXi_12.id_class == 201 || rrXi_12.id_class == 202 || rrXi_12.id_class == 210 || rrXi_12.id_class == rrdy_1.ANTIALIASING.ordinal()) continue;
            rrXi_12.id_int = bl;
        }
    }

    @Override
    public void id_private() {
        super.id_private();
        --this.id_public;
    }

    public static int id_final() {
        String string = System.getProperty("os.name").toLowerCase();
        if (string.contains("win")) {
            return 1;
        }
        if (string.contains("mac")) {
            return 2;
        }
        if (string.contains("solaris")) {
            return 3;
        }
        if (string.contains("sunos")) {
            return 3;
        }
        if (string.contains("linux")) {
            return 4;
        }
        return string.contains("unix") ? 4 : 0;
    }

    public QY id_native() {
        return this.id_volatile;
    }

    @Override
    public void v_() {
        if (rrdZ.Sm == null) {
            rrdZ.id_class();
        }
        int n = 120;
        int n2 = 20;
        int n3 = this.id_package - n - 10;
        int n4 = 30;
        int n5 = 20;
        int n6 = this.id_package - n - 20;
        this.id_goto = new rrkW(this, n6, this.id_int, n4, this.id_int - 50, 16);
        this.id_native.add(this.id_goto);
        this.id_class(new rrkO(rrdy_1.ANTIALIASING, n3, 0 * n5 + n4, n, n2));
        this.id_class(new rrkO(rrdy_1.NORMAL_MAP, n3, 1 * n5 + n4, n, n2));
        this.id_class(new rrkO(rrdy_1.SPECULAR_MAP, n3, 2 * n5 + n4, n, n2));
        this.id_class(new rrkO(rrdy_1.RENDER_RES_MUL, n3, 3 * n5 + n4, n, n2));
        this.id_class(new rrkO(rrdy_1.SHADOW_RES_MUL, n3, 4 * n5 + n4, n, n2));
        this.id_class(new rrkO(rrdy_1.HAND_DEPTH_MUL, n3, 5 * n5 + n4, n, n2));
        this.id_class(new rrkO(rrdy_1.OLD_HAND_LIGHT, n3, 6 * n5 + n4, n, n2));
        this.id_class(new rrkO(rrdy_1.OLD_LIGHTING, n3, 7 * n5 + n4, n, n2));
        int n7 = Math.min(150, n6 / 2 - 10);
        int n8 = n6 / 4 - n7 / 2;
        int n9 = this.id_int - 25;
        this.id_class(new rrXi_1(201, n8, n9, n7 - 22 + 1, n2, rrba_3.id_class("of.options.shaders.shadersFolder")));
        this.id_class(new rrkM(210, n8 + n7 - 22 - 1, n9));
        this.id_class(new rrXi_1(202, n6 / 4 * 3 - n7 / 2, this.id_int - 25, n7, n2, jI_2.id_class("gui.done", new Object[0])));
        this.id_class(new rrXi_1(203, n3, this.id_int - 25, n, n2, rrba_3.id_class("of.options.shaders.shaderOptions")));
        this.id_class(this.id_goto);
        this.id_finally();
    }

    @Override
    public void w_() {
        super.w_();
        if (!this.id_while) {
            rrdZ.id_break();
            this.id_while = true;
        }
    }
}

