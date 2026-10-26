/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.Ml_1;
import celestial.event.EventTarget;
import celestial.event.RenderEvent;
import celestial.ju_3;
import celestial.module.util.XRay;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rja_3;
import celestial.rrAM;
import celestial.rrTF;
import celestial.rrfD_2;
import celestial.rrjc_3;
import celestial.rrqc_3;
import celestial.rrqd_3;
import celestial.rrqz_3;
import celestial.yX_2;
import celestial.yt_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public abstract class rrqN_2
extends rrTF<XRay<?>>
implements rrqd_3 {
    private static boolean[] id_class;
    public Object[] id_break;
    private static float[] id_byte;
    private static short[] id_protected;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-47, -20, -80, 5, -106, 113, 52, 28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_byte() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        id_class = blArray;
    }

    public rrqN_2(XRay<?> xRay) {
        super(xRay);
        CopyOnWriteArraySet copyOnWriteArraySet;
        this.id_case();
        this.id_break[rrqN_2.id_protected[0]] = copyOnWriteArraySet = new CopyOnWriteArraySet();
    }

    static {
        rrqN_2.ntfClinit();
    }

    @EventTarget
    public void id_class(RenderEvent renderEvent) {
        yt_3 yt_32 = ((yX_2)rrqN_2.id_import.id_class[id_protected[1]]).id_static();
        Ml_1 ml_1 = renderEvent.id_class();
        double d = id_void.id_case();
        double d2 = id_void.id_catch();
        double d3 = id_void.id_private();
        ml_1.id_class();
        GL11.glEnable((int)id_protected[2]);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableBlend();
        RenderSystem.lineWidth(id_byte[0]);
        RenderSystem.disableTexture();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(id_class[0]);
        id_strictfp.id_class(id_class[1], ju_3.id_this);
        for (rrqc_3 rrqc_32 : this.id_final()) {
            rrqz_3 rrqz_32 = rrqc_32.id_class();
            if (!rrqz_32.id_byte().equals(rrjc_3.id_protected(rrqc_32.id_break()))) continue;
            rja_3 rja_32 = rrqc_32.id_byte();
            int n = rja_32.b_();
            int n2 = rja_32.c_();
            int n3 = rja_32.d_();
            rfH_2 rfH_22 = new rfH_2(rja_32);
            rfl_3 rfl_32 = rrjc_3.id_class(rrqz_32.id_byte().id_continue(), rfH_22).id_protected(n, n2, n3);
            if (!yt_32.id_class(rfl_32)) continue;
            rrfD_2.id_class(ml_1, rfl_32.id_protected(-d, -d2, -d3), rrqz_32.id_class());
        }
        id_default.id_break();
        RenderSystem.enableTexture();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask(id_class[2]);
        RenderSystem.disableBlend();
        GL11.glDisable((int)id_protected[3]);
        ml_1.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB0F34839;
    }

    @EventTarget
    public void id_class(rrAM rrAM2) {
        this.id_native();
    }

    public void id_class(rrqc_3 rrqc_32) {
        this.id_case();
        ((Set)this.id_break[id_protected[5]]).add(rrqc_32);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x51E5A26C6F9B5105L;
    }

    private static void id_class() {
        short[] sArray = new short[10];
        sArray[1] = 8;
        sArray[2] = 2848;
        sArray[3] = 2848;
        id_protected = sArray;
    }

    @Override
    public void id_break(rrqz_3 rrqz_32, boolean bl) {
        this.id_case();
        if (bl) {
            ((Set)this.id_break[id_protected[8]]).removeIf(rrqc_32 -> rrqc_32.id_class().equals(rrqz_32));
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrqN_2.id_byte();
        rrqN_2.id_class();
        rrqN_2.id_protected();
    }

    private void id_case() {
        if (this.id_break == null) {
            this.id_break = new Object[1];
        }
    }

    public void id_package() {
        this.id_case();
        ((Set)this.id_break[id_protected[6]]).clear();
    }

    private static void id_protected() {
        id_byte = new float[]{1.5f};
    }

    public Set<rrqc_3> id_final() {
        this.id_case();
        return (Set)this.id_break[id_protected[9]];
    }

    public void id_native() {
        this.id_case();
        ((Set)this.id_break[id_protected[4]]).clear();
    }

    @Override
    public boolean aK_() {
        this.id_native();
        return super.aK_();
    }

    @Override
    public void g_() {
        this.id_case();
        ((Set)this.id_break[id_protected[7]]).clear();
    }
}

