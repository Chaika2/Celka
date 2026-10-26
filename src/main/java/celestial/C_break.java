/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.context.StringRange
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 */
package celestial;

import celestial.Aq_1;
import celestial.Br_1;
import celestial.C;
import celestial.C_case;
import celestial.C_class;
import celestial.C_throws;
import celestial.H;
import celestial.I;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.St_1;
import celestial.T;
import celestial.V;
import celestial.Vu_1;
import celestial.Y;
import celestial.an_3;
import celestial.cQ_2;
import celestial.cW_2;
import celestial.cb_3;
import celestial.event.PacketEvent;
import celestial.f_1;
import celestial.gR_2;
import celestial.g_1;
import celestial.gm_3;
import celestial.iB_2;
import celestial.j_1;
import celestial.l_1;
import celestial.q_1;
import celestial.rFZ;
import celestial.rZD;
import celestial.rZR;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rhx_3;
import celestial.rjV_2;
import celestial.rrAH;
import celestial.rrAK;
import celestial.rrAM;
import celestial.rrAN;
import celestial.rrAO;
import celestial.rrAQ;
import celestial.rrAS;
import celestial.rrAT;
import celestial.rrAX;
import celestial.rrAZ;
import celestial.rrAc_1;
import celestial.rrAg_1;
import celestial.rrAl_1;
import celestial.rrAo_1;
import celestial.rrAq_1;
import celestial.rrAz_1;
import celestial.rrFK;
import celestial.rrFU;
import celestial.rrFY;
import celestial.rrFe_1;
import celestial.rrFf_1;
import celestial.rrFi_1;
import celestial.rrFj_1;
import celestial.rrFo_1;
import celestial.rrFw_1;
import celestial.rrLC;
import celestial.rrLE;
import celestial.rrLF;
import celestial.rrLI;
import celestial.rrLO;
import celestial.rrLU;
import celestial.rrLV;
import celestial.rrLX;
import celestial.rrLa_1;
import celestial.rrLc_1;
import celestial.rrLf_1;
import celestial.rrLh_1;
import celestial.rrLm_1;
import celestial.rrLp_1;
import celestial.rrLs_1;
import celestial.rrLu_1;
import celestial.rrLv_1;
import celestial.rrLx_1;
import celestial.rrLz_1;
import celestial.rrQX;
import celestial.rrnB_2;
import celestial.rrnG_2;
import celestial.rrnM_2;
import celestial.rrnd_3;
import celestial.rrns_3;
import celestial.rrnu_3;
import celestial.rrtu_3;
import celestial.ruS_2;
import celestial.rum_3;
import celestial.rvC_2;
import celestial.t_1;
import celestial.util.MinecraftAccessor;
import celestial.vm_3;
import celestial.w_1;
import celestial.xc_3;
import celestial.y_1;
import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_break
extends Enum<C_break>
implements MinecraftAccessor {
    private static short[] shortsf9703d96375232b196815afd59d1eb48;
    public static Object[] staticFieldsf9703d96375232b196815afd59d1eb48;
    private static String[] stringsf9703d96375232b196815afd59d1eb48;
    private static byte[] bytesf9703d96375232b196815afd59d1eb48;
    private static boolean[] booleansf9703d96375232b196815afd59d1eb48;

    public void id_byte() {
        BiFunction<Y, V, j_1> biFunction = j_1.id_break();
        for (C_case c_case : C_throws.id_class().id_case()) {
            V v = c_case.id_throw().id_catch() != null && c_case.id_throw().id_case() != null ? (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[shortsf9703d96375232b196815afd59d1eb48[44]]) : (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[shortsf9703d96375232b196815afd59d1eb48[45]]);
            j_1 j_12 = biFunction.apply((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[46]]), v);
            c_case.s().id_class(j_12);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsf9703d96375232b196815afd59d1eb48[47]]).id_finally().id_class(j_12);
            rrtu_3.id_protected();
        }
    }

    public void id_byte(ruS_2<?> ruS_22, rum_3 rum_32) {
        if (rum_32 != rum_3.CLIENTBOUND) {
            return;
        }
        for (C_case c_case : C_throws.id_class().id_case()) {
            if (c_case.id_throw().id_catch() == null || ((Aq_1)c_case.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[53]]).id_class() != ((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[54]]).id_break[shortsf9703d96375232b196815afd59d1eb48[55]]).id_class()) continue;
            c_case.s().id_break(new y_1(((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[56]]).id_break[shortsf9703d96375232b196815afd59d1eb48[57]]).id_class(), (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[58]]), ruS_22));
        }
    }

    static {
        C_break.ntfClinit();
    }

    public static C_break[] values() {
        return (C_break[])((C_break[])staticFieldsf9703d96375232b196815afd59d1eb48[shortsf9703d96375232b196815afd59d1eb48[0]]).clone();
    }

    public static C_break valueOf(String string) {
        return Enum.valueOf(C_break.class, string);
    }

    public void id_class(rrLC rrLC2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLC2);
        }
    }

    public void id_class(rrnM_2 rrnM_22) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrnM_22);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x359D7C24900A7B6EL;
    }

    public void id_class(rrLm_1 rrLm_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLm_12);
        }
    }

    public void id_class(rrFY rrFY2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFY2);
        }
    }

    public void id_class(rvC_2 rvC_22) {
        if (!((Boolean)C_class.id_instanceof().M.id_class[shortsf9703d96375232b196815afd59d1eb48[25]]).booleanValue()) {
            return;
        }
        rfj_3[] rfj_3Array = new rfj_3[booleansf9703d96375232b196815afd59d1eb48[4]];
        rvC_22.id_class((rfH_2 rfH_22, xc_3 xc_32) -> {
            if (((ImmutableSet)St_1.id_class[shortsf9703d96375232b196815afd59d1eb48[79]]).contains((Object)xc_32.id_break())) {
                rfj_3Array[C_break.booleansf9703d96375232b196815afd59d1eb48[17]] = new rfj_3((rfH_2)rfH_22);
            }
        });
        if (rfj_3Array[booleansf9703d96375232b196815afd59d1eb48[5]] == null) {
            return;
        }
        for (C_case c_case : C_throws.id_class().id_case()) {
            cb_3 cb_32 = c_case.id_throw().id_catch();
            if (cb_32 == null || (Aq_1)cb_32.id_break[shortsf9703d96375232b196815afd59d1eb48[26]] != (Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[27]]).id_break[shortsf9703d96375232b196815afd59d1eb48[28]]) continue;
            l_1 l_12 = new l_1((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[29]]), (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[30]]), rfj_3Array[C_break.booleansf9703d96375232b196815afd59d1eb48[6]].id_break, rfj_3Array[C_break.booleansf9703d96375232b196815afd59d1eb48[7]].id_byte);
            c_case.s().id_class(l_12);
        }
    }

    public void id_class(rrLE rrLE2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLE2);
        }
    }

    public void id_class(rrLF rrLF2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLF2);
        }
    }

    public void id_class(rrLc_1 rrLc_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLc_12);
        }
    }

    public void id_class(rrAq_1 rrAq_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAq_12);
        }
    }

    public void id_class(rrAz_1 rrAz_12) {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case != null) {
            c_case.s().id_class(rrAz_12);
        }
    }

    public void id_class(rrnB_2 rrnB_22) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrnB_22);
        }
    }

    public void id_class(rrnd_3 rrnd_32) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrnd_32);
        }
    }

    public void id_class(rrLf_1 rrLf_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLf_12);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-43, 25, 19, -8, 69, -62, -79, 101}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rrAH rrAH2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAH2);
        }
    }

    public void id_class(rZD rZD2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            cb_3 cb_32 = c_case.id_throw().id_catch();
            if (cb_32 == null || (Aq_1)cb_32.id_break[shortsf9703d96375232b196815afd59d1eb48[2]] != (Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[3]]).id_break[shortsf9703d96375232b196815afd59d1eb48[4]]) continue;
            l_1 l_12 = new l_1((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[5]]), rZD2.id_case() ? (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[6]]) : (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[7]]), rZD2.id_byte(), rZD2.id_protected());
            c_case.s().id_class(l_12);
        }
    }

    public void id_class(rrFU rrFU2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFU2);
        }
    }

    public void id_class(rrLu_1 rrLu_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLu_12);
        }
    }

    public void id_class(rrAg_1 rrAg_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAg_12);
        }
    }

    public boolean id_class(rhx_3 rhx_32) {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case == null) {
            return rhx_32.id_byte;
        }
        return !c_case.id_this().id_catch() && rhx_32.id_byte ? booleansf9703d96375232b196815afd59d1eb48[0] : booleansf9703d96375232b196815afd59d1eb48[1];
    }

    public void id_class(rrAQ rrAQ2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAQ2);
        }
    }

    public void id_class(rrLI rrLI2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLI2);
        }
    }

    public void id_class(rrFj_1 rrFj_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFj_12);
        }
    }

    public void id_class(rZR rZR2) {
        if (!((Boolean)C_class.id_instanceof().M.id_class[shortsf9703d96375232b196815afd59d1eb48[18]]).booleanValue()) {
            return;
        }
        if (!((ImmutableSet)St_1.id_class[shortsf9703d96375232b196815afd59d1eb48[19]]).contains((Object)rZR2.id_break().id_break())) {
            return;
        }
        for (C_case c_case : C_throws.id_class().id_case()) {
            cb_3 cb_32 = c_case.id_throw().id_catch();
            if (cb_32 == null || (Aq_1)cb_32.id_break[shortsf9703d96375232b196815afd59d1eb48[20]] != (Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[21]]).id_break[shortsf9703d96375232b196815afd59d1eb48[22]]) continue;
            l_1 l_12 = new l_1((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[23]]), (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[24]]), rZR2.id_byte().b_() >> bytesf9703d96375232b196815afd59d1eb48[0], rZR2.id_byte().d_() >> bytesf9703d96375232b196815afd59d1eb48[1]);
            c_case.s().id_class(l_12);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA19CE69;
    }

    public boolean id_class(Vu_1 vu_1) {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case == null) {
            return vu_1.id_protected();
        }
        I i = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsf9703d96375232b196815afd59d1eb48[1]]).id_finally().id_class(I.id_break(null));
        c_case.s().id_class(i);
        if (i.id_class() != null) {
            return i.id_class();
        }
        if (c_case != C_throws.id_class().id_break()) {
            return booleansf9703d96375232b196815afd59d1eb48[2];
        }
        return vu_1.id_protected();
    }

    public void id_class(rrAN rrAN2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAN2);
        }
    }

    public void id_class(q_1 q_12) {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case != null) {
            c_case.s().id_class(q_12);
        }
    }

    public void id_class(rrns_3 rrns_32) {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case != null) {
            c_case.s().id_class(rrns_32);
        }
    }

    public void id_class(iB_2 iB_22) {
        C_case c_case;
        if (cb_3.class.isInstance(iB_22) && (c_case = C_throws.id_class().id_private()) != null) {
            t_1 t_12 = ((t_1)t_1.id_class[shortsf9703d96375232b196815afd59d1eb48[42]]).id_break((w_1)((Object)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[shortsf9703d96375232b196815afd59d1eb48[43]]));
            c_case.s().id_class(t_12);
        }
    }

    public void id_class(rrLX rrLX2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLX2);
        }
    }

    public void id_class(rrAO rrAO2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAO2);
        }
    }

    public void id_class(rrLp_1 rrLp_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLp_12);
        }
    }

    public void id_class(Ml_1 ml_1, float f, rjV_2 rjV_22) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(new T(f, ml_1, rjV_22));
        }
    }

    public void id_class(rrAK rrAK2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAK2);
        }
    }

    public void id_class(rrLx_1 rrLx_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLx_12);
        }
    }

    public void id_class(rrLO rrLO2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLO2);
        }
    }

    public void id_class(rrFi_1 rrFi_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFi_12);
        }
    }

    public void id_class(ruS_2<?> ruS_22, rum_3 rum_32) {
        if (rum_32 != rum_3.CLIENTBOUND) {
            return;
        }
        for (C_case c_case : C_throws.id_class().id_case()) {
            if (c_case.id_throw().id_catch() == null || ((Aq_1)c_case.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[59]]).id_class() != ((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[60]]).id_break[shortsf9703d96375232b196815afd59d1eb48[61]]).id_class()) continue;
            c_case.s().id_break(new y_1(((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[62]]).id_break[shortsf9703d96375232b196815afd59d1eb48[63]]).id_class(), (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[64]]), ruS_22));
        }
    }

    public void id_class(rrFe_1 rrFe_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFe_12);
        }
    }

    public void id_class() {
        for (C_case c_case : C_throws.id_class().id_case()) {
            cb_3 cb_32 = c_case.id_throw().id_catch();
            if (cb_32 == null || (Aq_1)cb_32.id_break[shortsf9703d96375232b196815afd59d1eb48[31]] != (Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[32]]).id_break[shortsf9703d96375232b196815afd59d1eb48[33]]) continue;
            c_case.s().id_volatile();
        }
    }

    public void id_class(rrAZ rrAZ2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAZ2);
        }
    }

    public void id_class(t_1 t_12) {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case != null) {
            c_case.s().id_class(t_12);
        }
    }

    public void id_class(rrAS rrAS2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAS2);
        }
    }

    public void id_class(rrFK rrFK2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFK2);
        }
    }

    public void id_class(rrAo_1 rrAo_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAo_12);
        }
    }

    public void id_class(rrAc_1 rrAc_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAc_12);
        }
    }

    public boolean id_class(vm_3 vm_32) {
        return C_throws.id_class().id_break().id_this().id_catch() && (cb_3)C_break.id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[52]] != null || vm_32.id_continue ? booleansf9703d96375232b196815afd59d1eb48[15] : booleansf9703d96375232b196815afd59d1eb48[16];
    }

    public void id_class(rrLv_1 rrLv_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLv_12);
        }
    }

    public boolean id_class(cW_2 cW_22) {
        Lu_1 lu_1 = cW_22.id_byte();
        String string2 = lu_1.id_private();
        String string3 = string2.substring(booleansf9703d96375232b196815afd59d1eb48[8], Math.min(string2.length(), lu_1.id_final()));
        f_1 f_12 = new f_1(string3);
        C_throws.id_class().id_break().s().id_class(f_12);
        if (f_12.id_byte()) {
            return booleansf9703d96375232b196815afd59d1eb48[9];
        }
        if ((String[])f_12.id_class[shortsf9703d96375232b196815afd59d1eb48[34]] != null) {
            f_12.id_break();
            cW_22.id_class((ParseResults<gR_2>)null);
            if (cW_22.id_case()) {
                return booleansf9703d96375232b196815afd59d1eb48[10];
            }
            lu_1.id_byte(null);
            cW_22.id_class((cQ_2)null);
            cW_22.id_throws().clear();
            if (((String[])f_12.id_class[shortsf9703d96375232b196815afd59d1eb48[35]]).length == 0) {
                cW_22.id_class(Suggestions.empty());
            } else {
                StringRange stringRange = StringRange.between((int)(string3.lastIndexOf(stringsf9703d96375232b196815afd59d1eb48[0]) + booleansf9703d96375232b196815afd59d1eb48[11]), (int)string3.length());
                List list = Stream.of((String[])f_12.id_class[shortsf9703d96375232b196815afd59d1eb48[36]]).map(string -> new Suggestion(stringRange, string)).collect(Collectors.toList());
                Suggestions suggestions = new Suggestions(stringRange, list);
                cW_22.id_class(new CompletableFuture<Suggestions>());
                cW_22.id_protected().complete(suggestions);
            }
            cW_22.id_break(booleansf9703d96375232b196815afd59d1eb48[12]);
            return booleansf9703d96375232b196815afd59d1eb48[13];
        }
        return booleansf9703d96375232b196815afd59d1eb48[14];
    }

    public void id_class(rrLU rrLU2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLU2);
        }
    }

    public void id_class(an_3 an_32) {
        Float f = Float.valueOf(((Float)an_32.id_throws[shortsf9703d96375232b196815afd59d1eb48[37]]).floatValue());
        an_32.id_throws[C_break.shortsf9703d96375232b196815afd59d1eb48[38]] = f;
        if (!cb_3.class.isInstance(an_32) || C_throws.id_class().id_private() == null) {
            return;
        }
        t_1 t_12 = ((t_1)t_1.id_class[shortsf9703d96375232b196815afd59d1eb48[39]]).id_break((w_1)((Object)w_1.staticFieldsa114f317008a3fe78339d2b3c5e6fe39[shortsf9703d96375232b196815afd59d1eb48[40]]));
        Float f2 = Float.valueOf(t_12.id_class().id_throws());
        an_32.id_throws[C_break.shortsf9703d96375232b196815afd59d1eb48[41]] = f2;
    }

    public void id_class(rrFo_1 rrFo_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFo_12);
        }
    }

    public void id_class(rrLz_1 rrLz_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLz_12);
        }
    }

    public void id_class(rrAT rrAT2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAT2);
        }
    }

    public void id_class(rrLV rrLV2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLV2);
        }
    }

    public void id_class(rrLs_1 rrLs_12) {
        if ((cb_3)C_break.id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[77]] == null || (gm_3)C_break.id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[78]] == null) {
            return;
        }
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLs_12);
        }
    }

    public void id_class(PacketEvent packetEvent) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(packetEvent);
        }
    }

    public void id_class(rrAX rrAX2) {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case != null) {
            c_case.s().id_class(rrAX2);
        }
    }

    public void id_class(gm_3 gm_32) {
        C_throws.id_class().id_break().s().id_class(new g_1(gm_32, (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[51]])));
    }

    public void id_class(rrAM rrAM2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAM2);
        }
    }

    public void id_class(rrnG_2 rrnG_22) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrnG_22);
        }
    }

    public void id_class(rFZ rFZ2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            cb_3 cb_32 = c_case.id_throw().id_catch();
            if (cb_32 == null || (Aq_1)cb_32.id_break[shortsf9703d96375232b196815afd59d1eb48[8]] != (Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[9]]).id_break[shortsf9703d96375232b196815afd59d1eb48[10]]) continue;
            l_1 l_12 = new l_1((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[11]]), (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[12]]), rFZ2.id_break(), rFZ2.id_byte());
            c_case.s().id_class(l_12);
        }
    }

    public void id_class(rrLa_1 rrLa_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLa_12);
        }
    }

    public void id_class(rrLh_1 rrLh_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrLh_12);
        }
    }

    public void id_class(rrAl_1 rrAl_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrAl_12);
        }
    }

    public void id_class(rrFf_1 rrFf_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFf_12);
        }
    }

    public void id_class(rrFw_1 rrFw_12) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            c_case.s().id_class(rrFw_12);
        }
    }

    public void id_break(ruS_2<?> ruS_22, rum_3 rum_32) {
        if (rum_32 != rum_3.CLIENTBOUND) {
            return;
        }
        for (C_case c_case : C_throws.id_class().id_case()) {
            if (c_case.id_throw().id_catch() == null || ((Aq_1)c_case.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[65]]).id_class() != ((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[66]]).id_break[shortsf9703d96375232b196815afd59d1eb48[67]]).id_class()) continue;
            c_case.s().id_class(new y_1(((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[68]]).id_break[shortsf9703d96375232b196815afd59d1eb48[69]]).id_class(), (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[70]]), ruS_22));
        }
    }

    public void id_break() {
        C_case c_case = C_throws.id_class().id_private();
        if (c_case != null) {
            ((Br_1)c_case.id_catch()).id_throws();
        }
    }

    public boolean id_break(String string) {
        C c = new C(string);
        C_case c_case = C_throws.id_class().id_private();
        if (c_case == null) {
            return booleansf9703d96375232b196815afd59d1eb48[3];
        }
        c_case.s().id_class(c);
        return c.id_byte();
    }

    public void id_break(gm_3 gm_32) {
        if ((gm_3)C_break.id_import.id_class[shortsf9703d96375232b196815afd59d1eb48[48]] == null && gm_32 == null) {
            return;
        }
        C_throws.id_class().id_break().s().id_class(new g_1(gm_32, (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[49]])));
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shortsf9703d96375232b196815afd59d1eb48[50]]).id_finally().id_class(rrnu_3.id_class(gm_32));
    }

    public void id_break(rFZ rFZ2) {
        for (C_case c_case : C_throws.id_class().id_case()) {
            cb_3 cb_32 = c_case.id_throw().id_catch();
            if (cb_32 == null || (Aq_1)cb_32.id_break[shortsf9703d96375232b196815afd59d1eb48[13]] != (Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[14]]).id_break[shortsf9703d96375232b196815afd59d1eb48[15]]) continue;
            l_1 l_12 = new l_1((Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[16]]), (H)((Object)H.staticFields1fafa9bf76ed3352892023b88da3732d[shortsf9703d96375232b196815afd59d1eb48[17]]), rFZ2.id_break(), rFZ2.id_byte());
            c_case.s().id_class(l_12);
        }
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new C_break(), new C_break[]{(C_break)objectArray[0]}};
        staticFieldsf9703d96375232b196815afd59d1eb48 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        C_break.id_implements();
        C_break.id_private();
        C_break.id_catch();
        C_break.id_protected();
        C_break.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[81];
        sArray[0] = 1;
        sArray[3] = 57;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[9] = 57;
        sArray[12] = 1;
        sArray[14] = 57;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[21] = 57;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[27] = 57;
        sArray[29] = 1;
        sArray[30] = 2;
        sArray[32] = 57;
        sArray[34] = 1;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 15;
        sArray[38] = 72;
        sArray[41] = 15;
        sArray[45] = 1;
        sArray[48] = 56;
        sArray[51] = 1;
        sArray[52] = 57;
        sArray[54] = 57;
        sArray[56] = 57;
        sArray[60] = 57;
        sArray[62] = 57;
        sArray[64] = 1;
        sArray[66] = 57;
        sArray[68] = 57;
        sArray[72] = 57;
        sArray[74] = 57;
        sArray[76] = 1;
        sArray[77] = 57;
        sArray[78] = 56;
        shortsf9703d96375232b196815afd59d1eb48 = sArray;
    }

    private static /* synthetic */ C_break[] id_case() {
        C_break[] c_breakArray = new C_break[booleansf9703d96375232b196815afd59d1eb48[18]];
        c_breakArray[C_break.booleansf9703d96375232b196815afd59d1eb48[19]] = (C_break)staticFieldsf9703d96375232b196815afd59d1eb48[shortsf9703d96375232b196815afd59d1eb48[80]];
        return c_breakArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[23];
        blArray[0] = true;
        blArray[4] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[18] = true;
        blArray[22] = true;
        booleansf9703d96375232b196815afd59d1eb48 = blArray;
    }

    private static void id_protected() {
        bytesf9703d96375232b196815afd59d1eb48 = new byte[]{4, 4, 2};
    }

    public void id_protected(ruS_2<?> ruS_22, rum_3 rum_32) {
        if (rum_32 != rum_3.CLIENTBOUND) {
            return;
        }
        for (C_case c_case : C_throws.id_class().id_case()) {
            if (c_case.id_throw().id_catch() == null || ((Aq_1)c_case.id_throw().id_catch().id_break[shortsf9703d96375232b196815afd59d1eb48[71]]).id_class() != ((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[72]]).id_break[shortsf9703d96375232b196815afd59d1eb48[73]]).id_class()) continue;
            c_case.s().id_class(new y_1(((Aq_1)((cb_3)C_break.id_import.id_class[C_break.shortsf9703d96375232b196815afd59d1eb48[74]]).id_break[shortsf9703d96375232b196815afd59d1eb48[75]]).id_class(), (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[shortsf9703d96375232b196815afd59d1eb48[76]]), ruS_22));
        }
    }

    private static void id_private() {
        stringsf9703d96375232b196815afd59d1eb48 = new String[]{new String(" "), new String("INSTANCE")};
    }
}

