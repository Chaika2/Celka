/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.render.StaffViewer;
import celestial.rVa_1;
import celestial.rgN_2;
import celestial.rrFl_1;
import celestial.rrFv_1;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfu_3;
import celestial.rrqP_2;
import celestial.rrqS_2;
import celestial.rrqr_3;
import celestial.rrqs_3;
import celestial.ui.hud.HudWidget;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collection;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFZ
extends rrFl_1<rrqr_3> {
    private static short[] id_break;
    private static String[] id_protected;
    private static boolean[] id_throws;
    private static byte[] id_case;
    public Object[] id_class;
    private static float[] id_catch;

    @Override
    public Collection<rrqr_3> id_byte() {
        return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[9]]).id_private().o().id_new();
    }

    public rrFZ(HudWidget hudWidget) {
        this.id_case();
        HudWidget hudWidget2 = hudWidget;
        this.id_class[rrFZ.id_break[0]] = hudWidget2;
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_private().o().id_new().add(new rrFv_1(this, new rgN_2(id_protected[0]), rrfu_3.id_class().id_break(rVa_1.id_class(id_protected[1]), rVa_1.id_class(id_protected[2])).id_class(id_protected[3]).id_break()));
    }

    static {
        rrFZ.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7E331388;
    }

    public boolean id_class() {
        this.id_case();
        return (Boolean)this.id_class[id_break[11]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE81CFD803E62D764L;
    }

    @Override
    public float id_class(rrqr_3 rrqr_32) {
        String string = rrqr_32.id_protected().getString() + rrqr_32.id_private();
        return ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[10]]).id_finally().id_break(string) + id_catch[5];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-13, -30, -105, 17, -81, -52, 120, -105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, float f2) {
        this.id_case();
        float f3 = ((HudWidget)this.id_class[id_break[2]]).id_long();
        StaffViewer staffViewer = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[3]]).id_private().o();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[4]]).id_finally();
        this.id_break(id_catch[0]);
        float f4 = this.id_finally();
        float f5 = this.id_protected();
        rrZO2.id_class(MinecraftAccessor.id_strictfp);
        for (rrqr_3 rrqr_32 : staffViewer.id_super()) {
            AnimValue animValue = rrqr_32.id_break();
            rrqr_32.id_class(rrqr_32.id_catch());
            if (!animValue.id_case()) continue;
            float f6 = animValue.id_byte();
            float f7 = animValue.id_continue();
            float f8 = f5 * id_catch[1] * f7;
            float f9 = f + id_catch[2];
            float f10 = f2 + f4 - f8;
            int n = (int)(id_catch[3] * f6 * f3);
            rrZO2.id_break(ml_1, rrqr_32.id_protected(), (double)f9, (double)f10, rrZF.d_, n);
            rrZO2.id_break(ml_1, rrqr_32.id_byte(), (double)(f9 + ((HudWidget)this.id_class[id_break[5]]).id_implements() - rrZO2.id_break(rrqr_32.id_private()) - id_catch[4]), (double)f10, rrZF.d_, n);
            float f11 = f5 * f6;
            f4 += f11;
            this.id_class(f11);
        }
        rrZO2.id_byte(MinecraftAccessor.id_strictfp);
    }

    private static void id_break() {
        id_case = new byte[]{2};
    }

    @Override
    public void id_throws() {
        this.id_case();
        super.id_throws();
        Collection<rrqr_3> collection = this.id_byte();
        Boolean bl = id_throws[0];
        this.id_class[rrFZ.id_break[6]] = bl;
        if (!collection.isEmpty()) {
            Iterator<rrqr_3> iterator = collection.iterator();
            while (iterator.hasNext()) {
                rrqr_3 rrqr_32 = iterator.next();
                if (!(rrqr_32 instanceof rrqP_2)) continue;
                rrqP_2 rrqP_22 = (rrqP_2)rrqr_32;
                if (rrqr_32.id_break().id_catch()) {
                    iterator.remove();
                    continue;
                }
                if (rrqr_32.id_catch()) {
                    Boolean bl2 = id_throws[1];
                    this.id_class[rrFZ.id_break[7]] = bl2;
                }
                rrqs_3 rrqs_32 = rrqP_22.id_finally();
                rrqs_32.id_protected();
                if (rrqs_32.id_byte() != (rrqS_2)((Object)rrqS_2.staticFields76a63d849f9636f9a8b567c1e8edd09e[id_break[8]])) continue;
                rrqr_32.id_class(id_throws[2]);
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFZ.id_extends();
        rrFZ.id_catch();
        rrFZ.id_private();
        rrFZ.id_implements();
        rrFZ.id_break();
    }

    private static void id_catch() {
        id_protected = new String[]{new String("Preview Staff"), new String("#ffd700"), new String("#ffddaf"), new String("Status")};
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[5];
        blArray[1] = true;
        blArray[3] = true;
        id_throws = blArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
            objectArray[rrFZ.id_throws[3]] = id_throws[4];
        }
    }

    private static void id_implements() {
        id_catch = new float[]{18.0f, 0.8f, 3.0f, 255.0f, 5.0f, 15.0f, 10.0f};
    }

    @Override
    public float id_protected() {
        return id_catch[6];
    }

    private static void id_private() {
        short[] sArray = new short[12];
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 4;
        sArray[11] = 1;
        id_break = sArray;
    }
}

