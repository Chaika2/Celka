/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Qg_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.manager.FontManager;
import celestial.module.Module;
import celestial.module.util.XRay;
import celestial.q_1;
import celestial.rfH_2;
import celestial.rja_3;
import celestial.rrAM;
import celestial.rrFK;
import celestial.rrLM;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfu_3;
import celestial.rrjc_3;
import celestial.rrju_3;
import celestial.rrnB_2;
import celestial.rrqN_2;
import celestial.rrqQ_2;
import celestial.rrqW_2;
import celestial.rrqz_3;
import celestial.rrth_3;
import celestial.rrtx_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqk_3
extends rrqN_2 {
    private static byte[] id_byte;
    private static float[] id_protected;
    private static String[] id_case;
    private static boolean[] id_catch;
    public Object[] id_class;
    private static short[] id_private;

    public Comparator<rja_3> id_byte() {
        this.id_this();
        return (Comparator)this.id_class[id_private[34]];
    }

    private static void id_int() {
        id_case = new String[]{new String("\u0421\u043a\u0430\u043d\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435..."), new String("\u0413\u043e\u0442\u043e\u0432\u043e!"), new String("\u041e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d"), new String("\u0414\u043e\u0431\u0430\u0432\u044c\u0442\u0435 \u0431\u043b\u043e\u043a\u0438 \u0447\u0435\u0440\u0435\u0437 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 '.xray'")};
    }

    public rrqk_3(XRay<?> xRay) {
        super(xRay);
        ArrayList arrayList;
        this.id_this();
        this.id_class[rrqk_3.id_private[0]] = arrayList = new ArrayList();
        rrqW_2 rrqW_22 = new rrqW_2();
        this.id_class[rrqk_3.id_private[1]] = rrqW_22;
    }

    static {
        rrqk_3.ntfClinit();
    }

    private void id_this() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[3] = 0;
            this.id_class[4] = 0;
            this.id_class[5] = false;
        }
    }

    @EventTarget
    public void id_class(rrFK rrFK2) {
        ((XRay)this.id_continue()).id_byte(id_catch[1]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF71148DB735EF6D9L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{113, 97, 72, 65, -45, 78, -45, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrnB_2 rrnB_22) {
        this.id_this();
        Ml_1 ml_1 = rrnB_22.id_class();
        Qg_1 qg_1 = id_import.id_else();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_private[8]]).id_class();
        String string = rrfu_3.id_class((Module)this.id_continue()) + (Integer)this.id_class[id_private[9]] + " / " + (Integer)this.id_class[id_private[10]];
        String string2 = id_case[0];
        if (((Boolean)this.id_class[id_private[11]]).booleanValue()) {
            string2 = id_case[1];
        } else if (!((XRay)this.id_continue()).id_continue()) {
            string2 = id_case[2];
        }
        int n = (int)(qg_1.id_volatile() / id_protected[0]);
        int n2 = (int)(qg_1.id_final() / id_protected[1] + id_protected[2]);
        rrZO2.id_class(ml_1, string, (float)n, (float)n2, rrZF.d_, id_catch[4]);
        rrZO2.id_class(ml_1, string2, (double)((float)n - rrZO2.id_break(string2) / id_protected[3]), (double)(n2 + id_byte[0]), (int)id_byte[1], (int)id_private[12]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCE158D5C;
    }

    public void id_class(float f) {
        this.id_this();
        if ((cb_3)rrqk_3.id_import.id_class[id_private[17]] == null || (gm_3)rrqk_3.id_import.id_class[id_private[18]] == null) {
            return;
        }
        ((List)this.id_class[id_private[19]]).clear();
        rrjc_3.id_class(this::id_class, (rrju_3)((Object)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_private[20]]), f).forEach(rfH_22 -> {
            this.id_this();
            ((List)this.id_class[id_private[39]]).add(new rja_3(rfH_22.b_(), rfH_22.c_(), rfH_22.d_()));
        });
        ((List)this.id_class[id_private[21]]).sort(new rrqW_2());
        Integer n = ((List)this.id_class[id_private[22]]).size();
        this.id_class[rrqk_3.id_private[23]] = n;
    }

    private boolean id_class(rfH_2 rfH_22) {
        if (!((gm_3)rrqk_3.id_import.id_class[id_private[27]]).id_instanceof().id_class(rfH_22)) {
            return id_catch[11];
        }
        return id_catch[12];
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_this();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[2]]) && ((Integer)this.id_class[id_private[3]]).intValue() == ((Integer)this.id_class[id_private[4]]).intValue() && !((Boolean)this.id_class[id_private[5]]).booleanValue()) {
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_private[6]]).id_class(this.id_final().stream().map(rrqc_32 -> rrqc_32.id_class()).toList());
            Boolean bl = id_catch[3];
            this.id_class[rrqk_3.id_private[7]] = bl;
        }
    }

    public void id_class(rja_3 rja_32) {
        this.id_this();
        rja_3 rja_33 = rja_32;
        this.id_class[rrqk_3.id_private[15]] = rja_33;
    }

    public void id_class() {
        this.id_this();
        rrqk_3 rrqk_32 = this;
        Integer n = (Integer)rrqk_32.id_class[id_private[13]] + id_catch[7];
        rrqk_32.id_class[rrqk_3.id_private[14]] = n;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        super.id_class(rrAM2);
        ((XRay)this.id_continue()).id_byte(id_catch[0]);
    }

    @EventTarget
    public void id_class(rrLM rrLM2) {
        ((XRay)this.id_continue()).id_byte(id_catch[2]);
    }

    @Override
    public void id_break(rrqz_3 rrqz_32, boolean bl) {
        if (bl) {
            this.id_return();
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrqk_3.id_synchronized();
        rrqk_3.id_int();
        rrqk_3.id_new();
        rrqk_3.id_else();
        rrqk_3.id_public();
    }

    public boolean id_finally() {
        this.id_this();
        return (Boolean)this.id_class[id_private[38]];
    }

    public List<rja_3> id_extends() {
        this.id_this();
        return (List)this.id_class[id_private[33]];
    }

    public rja_3 id_case() {
        this.id_this();
        return (rja_3)this.id_class[id_private[35]];
    }

    private static void id_else() {
        id_protected = new float[]{2.0f, 2.0f, 20.0f, 2.0f};
    }

    public int id_implements() {
        this.id_this();
        return (Integer)this.id_class[id_private[36]];
    }

    private static void id_new() {
        short[] sArray = new short[40];
        sArray[1] = 1;
        sArray[3] = 4;
        sArray[4] = 3;
        sArray[5] = 5;
        sArray[7] = 5;
        sArray[9] = 4;
        sArray[10] = 3;
        sArray[11] = 5;
        sArray[12] = 255;
        sArray[13] = 4;
        sArray[14] = 4;
        sArray[15] = 2;
        sArray[17] = 57;
        sArray[18] = 56;
        sArray[23] = 3;
        sArray[24] = 3;
        sArray[25] = 4;
        sArray[26] = 5;
        sArray[27] = 56;
        sArray[28] = 57;
        sArray[29] = 56;
        sArray[32] = 2000;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[36] = 3;
        sArray[37] = 4;
        sArray[38] = 5;
        id_private = sArray;
    }

    private boolean id_return() {
        XRay xRay = (XRay)this.id_continue();
        if ((cb_3)rrqk_3.id_import.id_class[id_private[28]] == null || (gm_3)rrqk_3.id_import.id_class[id_private[29]] == null || !xRay.aJ_()) {
            return id_catch[13];
        }
        if (((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_private[30]]).id_break().isEmpty()) {
            xRay.id_byte(id_catch[14]);
            String string = id_case[3];
            rrfu_3.id_byte(rrfu_3.id_class(xRay) + string);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_private[31]]).id_class(new rrtx_3(xRay.id_final(), string, (int)id_private[32]));
            return id_catch[15];
        }
        return id_catch[16];
    }

    private static void id_public() {
        id_byte = new byte[]{10, 15, 6, 3, 4, 5};
    }

    public int id_protected() {
        this.id_this();
        return (Integer)this.id_class[id_private[37]];
    }

    public void id_private() {
        this.id_this();
        ((List)this.id_class[id_private[16]]).clear();
    }

    private static void id_synchronized() {
        boolean[] blArray = new boolean[20];
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[12] = true;
        blArray[15] = true;
        id_catch = blArray;
    }

    @Override
    public void id_native() {
        this.id_this();
        super.id_native();
        this.id_private();
        this.id_package();
        this.id_class((rja_3)null);
        Integer n = id_catch[8];
        this.id_class[rrqk_3.id_private[24]] = n;
        Integer n2 = id_catch[9];
        this.id_class[rrqk_3.id_private[25]] = n2;
        Boolean bl = id_catch[10];
        this.id_class[rrqk_3.id_private[26]] = bl;
    }

    @Override
    public boolean aI_() {
        boolean bl;
        boolean bl2 = bl = super.aI_() && !this.id_return() ? id_catch[5] : id_catch[6];
        if (bl) {
            this.id_class(((Float)((XRay)this.id_continue()).id_else().id_byte()).floatValue());
        }
        return bl;
    }

    @Override
    public void g_() {
        this.id_return();
    }
}

