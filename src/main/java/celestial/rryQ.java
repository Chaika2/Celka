/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Aw_1;
import celestial.Ax_1;
import celestial.C_class;
import celestial.Fc_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.Module;
import celestial.module.combat.AutoDuel;
import celestial.q_1;
import celestial.rJY;
import celestial.rVi_1;
import celestial.rXa_1;
import celestial.rXe_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgn_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rql_3;
import celestial.rqn_3;
import celestial.rqr_3;
import celestial.rrAM;
import celestial.rrAZ;
import celestial.rrFY;
import celestial.rrFo_1;
import celestial.rrIQ;
import celestial.rrLO;
import celestial.rrLu_1;
import celestial.rrTF;
import celestial.rrZW;
import celestial.rrfZ_2;
import celestial.rrfu_3;
import celestial.rrjS_2;
import celestial.rryL;
import celestial.rryN;
import celestial.rryZ;
import celestial.rryc_1;
import celestial.rryd_1;
import celestial.rryk_1;
import celestial.rrym_1;
import celestial.rryu_1;
import celestial.rryv_1;
import celestial.ruS_2;
import celestial.rvt_3;
import celestial.setting.Setting;
import celestial.util.MinecraftAccessor;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryQ
extends rrTF<AutoDuel> {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    private static String[] id_case;
    public Object[] id_break;
    private static float[] id_catch;
    private static short[] id_private;

    private void id_byte() {
        this.id_implements();
        if (this.id_class()) {
            ((cb_3)rryQ.id_import.id_class[id_private[50]]).id_case(id_case[23]);
            rryc_1 rryc_12 = (rryc_1)((Object)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[51]]);
            this.id_break[rryQ.id_private[52]] = rryc_12;
        } else if (this.id_break()) {
            ((cb_3)rryQ.id_import.id_class[id_private[53]]).id_case(id_case[24]);
        }
    }

    private boolean id_byte(rdn_3 rdn_32) {
        if (rdn_32 == null || rdn_32.id_class()) {
            return id_protected[35];
        }
        String string = rdn_32.id_continue().id_byte();
        return string.startsWith(id_case[27]) && !string.contains(id_case[28]) ? id_protected[36] : id_protected[37];
    }

    public rryQ(AutoDuel autoDuel) {
        super(autoDuel);
        this.id_implements();
        String[] stringArray = new String[id_byte[0]];
        stringArray[rryQ.id_protected[0]] = id_case[2];
        stringArray[rryQ.id_protected[1]] = id_case[3];
        rrIQ rrIQ2 = new rrIQ(id_case[0], id_case[1], stringArray);
        this.id_break[rryQ.id_private[0]] = rrIQ2;
        autoDuel.id_class((Setting)((rrIQ)this.id_break[id_private[1]]).id_class(() -> autoDuel.id_new() == this ? id_protected[47] : id_protected[48]));
    }

    static {
        rryQ.ntfClinit();
    }

    private void id_class(rryv_1 rryv_12, rVi_1 rVi_12) {
        rrym_1 rrym_12;
        String string;
        if (rryv_12 instanceof rrym_1 && !rql_3.id_break(string = (rrym_12 = (rrym_1)rryv_12).id_break().id_class())) {
            rVi_12.id_break(rgF_2.RED + " (" + string + ")");
        }
    }

    @EventTarget
    public void id_class(rrLu_1 rrLu_12) {
        rvt_3 rvt_32;
        rqA_2 rqA_22;
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvt_3 && (rqA_22 = (rvt_32 = (rvt_3)ruS_22).id_break()) == rqn_3.MC) {
            rrLu_12.id_class(id_protected[26]);
        }
    }

    private boolean id_class(Fc_1 fc_1) {
        return fc_1.id_new().id_byte().equals(id_case[26]);
    }

    private rVi_1 id_class(rVi_1 rVi_12) {
        return rrfu_3.id_break((Module)this.id_continue()).id_class(rgF_2.GRAY).id_class(rVi_12);
    }

    @EventTarget
    public void id_class(rrLO rrLO2) {
        this.id_implements();
        if (rrLO2.id_class() != null) {
            return;
        }
        String string = rrLO2.id_protected().toLowerCase();
        if (string.equals(id_case[12])) {
            ((AutoDuel)this.id_continue()).id_byte(id_protected[27]);
        } else if (string.equals(id_case[13]) || string.equals(id_case[14])) {
            Object var7_3 = null;
            this.id_break[rryQ.id_private[35]] = var7_3;
        } else if (string.equals(id_case[15]) || string.equals(id_case[16]) || string.startsWith(id_case[17]) || string.contains(id_case[18]) || string.contains(id_case[19])) {
            this.id_protected();
        } else if (string.contains(id_case[20])) {
            this.id_extends();
        } else if (string.contains(id_case[21])) {
            Boolean bl = id_protected[28];
            this.id_break[rryQ.id_private[36]] = bl;
        }
    }

    @EventTarget
    public void id_class(rrAZ rrAZ2) {
        this.id_implements();
        vm_3 vm_32 = rrAZ2.id_class();
        if (vm_32 instanceof Fc_1) {
            Fc_1 fc_1 = (Fc_1)vm_32;
            rXe_1 rXe_12 = (rXe_1)fc_1.G_();
            if (this.id_class(fc_1)) {
                List<rJY> list;
                ((rqr_3)((cb_3)rryQ.id_import.id_class[rryQ.id_private[17]]).id_break[rryQ.id_private[18]]).id_finally = id_protected[23];
                if ((rryc_1)((Object)this.id_break[id_private[19]]) == (rryc_1)((Object)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[20]])) {
                    List<rJY> list2 = rXe_12.id_class((rJY rJY2) -> this.id_byte(rJY2.id_class()) && !this.id_break(rJY2.id_class()) ? id_protected[45] : id_protected[46]);
                    for (rJY rJY3 : list2) {
                        ((Ax_1)rryQ.id_import.id_class[id_private[21]]).id_class(rXe_12.id_case, rJY3.id_protected, id_byte[3], rXa_1.CLONE);
                    }
                    if (list2.isEmpty()) {
                        rryc_1 rryc_12 = (rryc_1)((Object)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[22]]);
                        this.id_break[rryQ.id_private[23]] = rryc_12;
                    }
                } else if ((rryc_1)((Object)this.id_break[id_private[24]]) == (rryc_1)((Object)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[25]]) && !(list = rXe_12.id_class((rJY rJY2) -> this.id_class(rJY2.id_class()))).isEmpty()) {
                    ((Ax_1)rryQ.id_import.id_class[id_private[26]]).id_class(rXe_12.id_case, list.get((int)rryQ.id_protected[24]).id_protected, id_byte[4], rXa_1.CLONE);
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrAM rrAM2) {
        this.id_implements();
        Boolean bl = rrjS_2.id_byte();
        this.id_break[rryQ.id_private[33]] = bl;
        if (!((Boolean)this.id_break[id_private[34]]).booleanValue()) {
            this.id_protected();
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-44, 106, 71, 0, 81, 17, 28, -100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBC63B71EBCE610EAL;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_implements();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[2]])) {
            boolean bl = rrjS_2.id_byte();
            if (rrfZ_2.id_byte() || ((Boolean)this.id_break[id_private[3]]).booleanValue()) {
                AutoDuel autoDuel = (AutoDuel)this.id_continue();
                autoDuel.id_byte(id_protected[2]);
                if (bl) {
                    MinecraftAccessor.a_(rrfu_3.id_class(autoDuel) + "\u0414\u0443\u044d\u043b\u044c \u043d\u0430\u0447\u0430\u043b\u0430\u0441\u044c", id_protected[3]);
                }
                return;
            }
            Collection<Aw_1> collection = ((Aq_1)((cb_3)rryQ.id_import.id_class[rryQ.id_private[4]]).id_break[id_private[5]]).id_throws();
            if (!((Boolean)this.id_break[id_private[6]]).booleanValue() && !bl) {
                this.id_byte();
                Boolean bl2 = id_protected[4];
                this.id_break[rryQ.id_private[7]] = bl2;
            } else if (((Boolean)this.id_break[id_private[8]]).booleanValue() && !collection.isEmpty()) {
                Collection<rryu_1> collection2 = this.id_class(collection);
                ArrayList<rryu_1> arrayList = new ArrayList<rryu_1>();
                ArrayList<rryu_1> arrayList2 = new ArrayList<rryu_1>();
                for (rryu_1 object : collection2) {
                    switch (((int[])rryN.id_class[id_private[9]])[object.id_break().id_class().ordinal()]) {
                        case 1: {
                            arrayList.add(object);
                            break;
                        }
                        case 2: {
                            arrayList2.add(object);
                        }
                    }
                }
                boolean bl3 = id_protected[5];
                for (rryu_1 rryu_12 : collection2) {
                    rVi_1 rVi_12;
                    rVi_1 rVi_13;
                    rryv_1 rryv_12 = rryu_12.id_break();
                    String string = rryu_12.id_class();
                    if (rryv_12.id_throws()) {
                        rryQ rryQ2 = this;
                        int n = (Integer)rryQ2.id_break[id_private[10]] + id_protected[6];
                        Integer n2 = n;
                        rryQ2.id_break[rryQ.id_private[11]] = n2;
                        if (n < id_byte[1]) continue;
                        rVi_1 rVi_15 = this.id_class(new rgN_2("\u0418\u0433\u0440\u043e\u043a '" + string + "' \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0432\u0430\u0448\u0438\u043c \u0434\u0440\u0443\u0433\u043e\u043c"));
                        rrfu_3.id_class(rVi_15);
                        MinecraftAccessor.a_(rVi_15.getString(), id_protected[7]);
                        this.id_extends();
                        bl3 = id_protected[8];
                        break;
                    }
                    if (rryv_12.id_byte()) {
                        rVi_1 rVi_132;
                        if (arrayList2.isEmpty()) continue;
                        rryQ rryQ3 = this;
                        int n = (Integer)rryQ3.id_break[id_private[12]] + id_protected[9];
                        Integer n3 = n;
                        rryQ3.id_break[rryQ.id_private[13]] = n3;
                        if (n < id_byte[2]) continue;
                        if (arrayList2.size() == id_protected[10]) {
                            rgN_2 i = new rgN_2("\u041d\u0430\u0439\u0434\u0435\u043d \u0438\u0433\u0440\u043e\u043a \u0432 \u0447\u0451\u0440\u043d\u043e\u043c \u0441\u043f\u0438\u0441\u043a\u0435: " + string);
                            this.id_class(((rryu_1)arrayList2.get(id_protected[11])).id_break(), i);
                            rVi_132 = this.id_class(i);
                        } else {
                            rVi_132 = this.id_class(new rgN_2(id_case[4]));
                            for (int rVi_122 = id_protected[12]; rVi_122 < arrayList2.size(); ++rVi_122) {
                                rryu_1 rgN_23 = (rryu_1)arrayList2.get(rVi_122);
                                String rVi_16 = rgN_23.id_class();
                                rVi_132.id_break(rVi_16);
                                this.id_class(rgN_23.id_break(), rVi_132);
                                if (rVi_122 >= arrayList2.size() - id_protected[13]) continue;
                                rVi_132.id_break(id_case[5]);
                            }
                        }
                        rrfu_3.id_class(rVi_132);
                        MinecraftAccessor.a_(rVi_132.getString(), id_protected[14]);
                        this.id_extends();
                        bl3 = id_protected[15];
                        break;
                    }
                    if (!rryv_12.id_protected()) continue;
                    if (arrayList.isEmpty()) break;
                    rgN_2 rgN_22 = new rgN_2(rgF_2.RED + "[Block]");
                    if (arrayList.size() == id_protected[16]) {
                        rVi_1 i = this.id_class(rgN_22, string);
                        rVi_13 = this.id_class(new rgN_2("\u041d\u0430\u0439\u0434\u0435\u043d \u0438\u0433\u0440\u043e\u043a '" + string + "'").id_break(id_case[6]).id_class(i));
                        rVi_12 = this.id_class(new rgN_2("\u041d\u0430\u0439\u0434\u0435\u043d \u0438\u0433\u0440\u043e\u043a '" + string + "'"));
                    } else {
                        rVi_13 = this.id_class(new rgN_2(id_case[7]));
                        rVi_12 = this.id_class(new rgN_2(id_case[8]));
                        for (int i = id_protected[17]; i < arrayList.size(); ++i) {
                            rryu_1 rryu_13 = (rryu_1)arrayList.get(i);
                            String string2 = rryu_13.id_class();
                            rVi_1 rVi_14 = this.id_class(rgN_22, string2);
                            rVi_13.id_break(string2).id_break(id_case[9]).id_class(rVi_14);
                            rVi_12.id_break(string2);
                            if (i >= arrayList.size() - id_protected[18]) continue;
                            rVi_13.id_break(id_case[10]);
                            rVi_12.id_break(id_case[11]);
                        }
                    }
                    rrfu_3.id_class(rVi_13);
                    MinecraftAccessor.a_(rVi_12.getString(), id_protected[19]);
                    ((cb_3)rryQ.id_import.id_class[id_private[14]]).id_class(rqn_3.MC, rqL_2.RECORDS, id_catch[0], id_catch[1]);
                    bl3 = id_protected[20];
                    break;
                }
                if (bl3) {
                    Boolean bl2 = id_protected[21];
                    this.id_break[rryQ.id_private[15]] = bl2;
                    Integer n = id_protected[22];
                    this.id_break[rryQ.id_private[16]] = n;
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrFo_1 rrFo_12) {
        this.id_implements();
        vm_3 vm_32 = rrFo_12.id_break();
        if (vm_32 instanceof Fc_1) {
            Fc_1 fc_1 = (Fc_1)vm_32;
            if (((rryc_1)((Object)this.id_break[id_private[27]]) == (rryc_1)((Object)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[28]]) || (rryc_1)((Object)this.id_break[id_private[29]]) == (rryc_1)((Object)rryc_1.staticFields7b9d953229a23ea8afc65e6592cc33c5[id_private[30]])) && this.id_class(fc_1)) {
                Object var8_4 = null;
                this.id_break[rryQ.id_private[31]] = var8_4;
            }
        }
    }

    private boolean id_class(rdn_3 rdn_32) {
        if (rdn_32 == null || rdn_32.id_class()) {
            return id_protected[42];
        }
        return rdn_32.id_break() == rdy_3.Ek && rdn_32.id_continue().id_byte().equals(id_case[34]) ? id_protected[43] : id_protected[44];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x496CA7E8;
    }

    public boolean id_class() {
        this.id_implements();
        return ((String)((rrIQ)this.id_break[id_private[56]]).id_byte()).equals(id_case[36]);
    }

    private rVi_1 id_class(rVi_1 rVi_12, String string) {
        Object[] objectArray = new Object[id_protected[29]];
        objectArray[rryQ.id_protected[30]] = string;
        return rgv_3.id_class(rVi_12, new rgy_3(rgp_3.id_class, new rgn_3(id_case[22], objectArray)), new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_private[45]] + "duel blacklist add " + string + " "));
    }

    private Collection<rryu_1> id_class(Collection<Aw_1> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        Aw_1 aw_1 = ((cb_3)rryQ.id_import.id_class[id_private[40]]).id_continue();
        HashSet<rryu_1> hashSet = new HashSet<rryu_1>();
        boolean bl = this.id_class();
        for (Aw_1 aw_12 : collection) {
            if (aw_12 == aw_1) continue;
            String string = aw_12.id_class().getName();
            String string2 = string.toLowerCase();
            if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_private[41]]).id_break(string2)) {
                if (bl) continue;
                hashSet.add(new rryu_1(string, (rryv_1)id_class[id_private[42]]));
                continue;
            }
            rryk_1 rryk_12 = ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_private[43]]).id_protected(string2);
            if (rryk_12 != null) {
                hashSet.add(new rryu_1(string, new rrym_1(rryk_12)));
                continue;
            }
            hashSet.add(new rryu_1(string, (rryv_1)id_class[id_private[44]]));
        }
        return hashSet;
    }

    @EventTarget
    public void id_class(rrFY rrFY2) {
        this.id_implements();
        vm_3 vm_32 = rrFY2.id_class();
        if (vm_32 instanceof Fc_1) {
            Fc_1 fc_1 = (Fc_1)vm_32;
            if ((rryc_1)((Object)this.id_break[id_private[32]]) != null && this.id_class(fc_1)) {
                ((AutoDuel)this.id_continue()).id_byte(id_protected[25]);
            }
        }
    }

    private boolean id_break(rdn_3 rdn_32) {
        rcd_3 rcd_32;
        if (rdn_32 == null || rdn_32.id_class() || !rdn_32.id_final()) {
            return id_protected[38];
        }
        rcd_3 rcd_33 = rdn_32.id_package();
        if (rcd_33.id_byte(id_case[29], id_byte[5]) && (rcd_32 = rcd_33.id_int(id_case[30])).id_protected(id_case[31]) == id_byte[6]) {
            rcy_3 rcy_32 = rcd_32.id_protected(id_case[32], id_byte[7]);
            for (int i = id_protected[39]; i < rcy_32.size(); ++i) {
                String string = rcy_32.id_implements(i);
                if (!string.contains(id_case[33])) continue;
                return id_protected[40];
            }
        }
        return id_protected[41];
    }

    public boolean id_break() {
        this.id_implements();
        return ((String)((rrIQ)this.id_break[id_private[55]]).id_byte()).equals(id_case[35]);
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{18, new rryL(), new rryZ()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryQ.id_case();
        rryQ.id_native();
        rryQ.id_final();
        rryQ.id_private();
        rryQ.id_finally();
        rryQ.id_throws();
    }

    private static void id_finally() {
        id_byte = new byte[]{2, 18, 18, 2, 2, 10, 9, 8, 2, 6, 2, 3, 4, 3, 18};
    }

    private void id_extends() {
        ((cb_3)rryQ.id_import.id_class[id_private[54]]).id_case(id_case[25]);
    }

    private static void id_case() {
        boolean[] blArray = new boolean[56];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[29] = true;
        blArray[36] = true;
        blArray[40] = true;
        blArray[43] = true;
        blArray[45] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[50] = true;
        id_protected = blArray;
    }

    private void id_implements() {
        if (this.id_break == null) {
            this.id_break = new Object[6];
            this.id_break[1] = false;
            this.id_break[2] = false;
            this.id_break[3] = false;
            this.id_break[4] = 0;
        }
    }

    private void id_protected() {
        this.id_implements();
        Boolean bl = id_protected[31];
        this.id_break[rryQ.id_private[46]] = bl;
        Boolean bl2 = id_protected[32];
        this.id_break[rryQ.id_private[47]] = bl2;
        Boolean bl3 = id_protected[33];
        this.id_break[rryQ.id_private[48]] = bl3;
        Integer n = id_protected[34];
        this.id_break[rryQ.id_private[49]] = n;
    }

    private static void id_private() {
        id_catch = new float[]{1.0f, 1.0f};
    }

    private static void id_final() {
        short[] sArray = new short[57];
        sArray[0] = 5;
        sArray[1] = 5;
        sArray[3] = 3;
        sArray[4] = 57;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 4;
        sArray[11] = 4;
        sArray[12] = 4;
        sArray[13] = 4;
        sArray[14] = 57;
        sArray[15] = 2;
        sArray[16] = 4;
        sArray[17] = 57;
        sArray[18] = 17;
        sArray[21] = 55;
        sArray[22] = 1;
        sArray[25] = 1;
        sArray[26] = 55;
        sArray[28] = 1;
        sArray[33] = 2;
        sArray[34] = 2;
        sArray[36] = 3;
        sArray[40] = 57;
        sArray[42] = 2;
        sArray[44] = 1;
        sArray[46] = 1;
        sArray[47] = 2;
        sArray[48] = 3;
        sArray[49] = 4;
        sArray[50] = 57;
        sArray[53] = 57;
        sArray[54] = 57;
        sArray[55] = 5;
        sArray[56] = 5;
        id_private = sArray;
    }

    private static void id_native() {
        id_case = new String[]{new String("\u0420\u0435\u0436\u0438\u043c"), new String("\u041e\u0434\u0438\u043d\u043e\u0447\u043d\u044b\u0439"), new String("\u041e\u0434\u0438\u043d\u043e\u0447\u043d\u044b\u0439"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u043d\u044b\u0439"), new String("\u041d\u0430\u0439\u0434\u0435\u043d\u044b \u0438\u0433\u0440\u043e\u043a\u0438 \u0432 \u0447\u0451\u0440\u043d\u043e\u043c \u0441\u043f\u0438\u0441\u043a\u0435: "), new String(", "), new String(" "), new String("\u041d\u0430\u0439\u0434\u0435\u043d\u044b \u0438\u0433\u0440\u043e\u043a\u0438: "), new String("\u041d\u0430\u0439\u0434\u0435\u043d\u044b \u0438\u0433\u0440\u043e\u043a\u0438: "), new String(" "), new String(", "), new String(", "), new String("[\u2694] \u0432\u044b \u043d\u0435 \u0434\u043e\u0441\u0442\u0430\u0442\u043e\u0447\u043d\u043e \u043d\u0430\u0438\u0433\u0440\u0430\u043b\u0438 \u0432\u0440\u0435\u043c\u0435\u043d\u0438 \u0447\u0442\u043e\u0431\u044b \u043d\u0430\u0447\u0430\u0442\u044c \u0434\u0443\u044d\u043b\u044c!"), new String("[\u2694] \u043f\u043e\u0438\u0441\u043a \u043a\u043e\u043c\u0430\u043d\u0434\u043d\u043e\u0439 \u0434\u0443\u044d\u043b\u0438 \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043d\u0430\u0447\u0430\u0442!"), new String("[\u2694] \u043e\u0442\u043c\u0435\u043d\u0438\u0442\u0435 \u043f\u043e\u0438\u0441\u043a, \u0447\u0442\u043e\u0431\u044b \u043f\u0440\u0438\u043d\u044f\u0442\u044c \u0437\u0430\u043f\u0440\u043e\u0441."), new String("[\u2718] \u043e\u0448\u0438\u0431\u043a\u0430! \u0432\u044b \u043d\u0435 \u044f\u0432\u043b\u044f\u0435\u0442\u0435\u0441\u044c \u0434\u0443\u044d\u043b\u044f\u043d\u0442\u043e\u043c!"), new String("[\u2718] \u043e\u0448\u0438\u0431\u043a\u0430! \u0432\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0441\u0434\u0435\u043b\u0430\u0442\u044c \u044d\u0442\u043e \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0434\u0443\u044d\u043b\u0438!"), new String("[\u2694] \u043f\u043e\u0438\u0441\u043a \u043a\u043e\u043c\u0430\u043d\u0434\u043d\u043e\u0439 \u0434\u0443\u044d\u043b\u0438 \u0431\u044b\u043b \u043e\u0442\u043c\u0435\u043d\u0435\u043d"), new String("[\u2694] \u043f\u043e\u0438\u0441\u043a \u0434\u0443\u044d\u043b\u0438 \u043e\u0442\u043c\u0435\u043d\u0451\u043d"), new String("\u0432\u044b \u0441\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u044b\u0441\u0442\u0440\u043e \u043f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\u0438\u0442\u0435"), new String("[\u2694] \u0434\u0443\u044d\u043b\u044c \u0437\u0430\u0432\u0435\u0440\u0448\u0435\u043d\u0430"), new String("[\u2694] \u0434\u0443\u044d\u043b\u044c \u043d\u0430\u0447\u0430\u043b\u0430\u0441\u044c!"), new String("autoduel.blacklist.add"), new String("/duel team search"), new String("/duel search"), new String("/duel leave"), new String("\u2694 \u0412\u044b\u0431\u043e\u0440 \u0441\u043e\u044e\u0437\u043d\u0438\u043a\u043e\u0432"), new String("[\u2694] \u0418\u0433\u0440\u043e\u043a"), new String("\u043b\u0438\u0434\u0435\u0440"), new String("display"), new String("display"), new String("Lore"), new String("Lore"), new String("\u0423\u0431\u0440\u0430\u0442\u044c"), new String("[\u041d\u0430\u0447\u0430\u0442\u044c \u043f\u043e\u0438\u0441\u043a \u043a\u043e\u043c\u0430\u043d\u0434\u043d\u043e\u0439 \u0434\u0443\u044d\u043b\u0438]"), new String("\u041e\u0434\u0438\u043d\u043e\u0447\u043d\u044b\u0439"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u043d\u044b\u0439")};
    }

    @Override
    public boolean aI_() {
        this.id_implements();
        this.id_protected();
        Object var5_1 = null;
        this.id_break[rryQ.id_private[37]] = var5_1;
        rrfu_3.id_byte(rrfu_3.id_class((Module)this.id_continue()) + "\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c \u0438\u0433\u0440\u043e\u043a\u0430 \u0432 \u0447\u0451\u0440\u043d\u044b\u0439 \u0441\u043f\u0438\u0441\u043e\u043a: " + (String)C_class.id_instanceof().id_protected.id_class[id_private[38]] + "duel blacklist add <\u043d\u0438\u043a> <\u0437\u0430\u043c\u0435\u0442\u043a\u0430>");
        return super.aI_();
    }

    @Override
    public boolean aK_() {
        this.id_implements();
        this.id_protected();
        Object var5_1 = null;
        this.id_break[rryQ.id_private[39]] = var5_1;
        return super.aK_();
    }
}

