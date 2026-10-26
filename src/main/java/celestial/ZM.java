/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.HZ;
import celestial.LF;
import celestial.Ln_1;
import celestial.Ma_1;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.ZO;
import celestial.ZX;
import celestial.Zh_1;
import celestial.cC_2;
import celestial.cN_2;
import celestial.ch_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rVj_1;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rmo_3;
import celestial.rpl_3;
import celestial.rpm_3;
import celestial.rqR_2;
import celestial.rqu_3;
import celestial.rrvs_1;
import celestial.ux_3;
import celestial.vm_3;
import celestial.vs_3;
import celestial.vz_3;
import celestial.yb_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class ZM
extends vm_3
implements rrvs_1 {
    private static final rgP_2 id_class = new rgn_3("book.editTitle");
    private static final rgP_2 id_throws = new rgn_3("book.finalizeWarning");
    private static final rpl_3 id_case = rpl_3.id_class("_", rgc_3.id_class.id_class(rgF_2.BLACK));
    private static final rpl_3 id_catch = rpl_3.id_class("_", rgc_3.id_class.id_class(rgF_2.GRAY));
    private final rhd_3 id_private;
    private final rdn_3 id_implements;
    private boolean id_finally;
    private boolean id_else;
    private int id_synchronized;
    private int id_return;
    private final List<String> id_public = Lists.newArrayList();
    private String id_goto = "";
    private final ux_3 id_while = new ux_3(this::id_import, this::id_byte, this::id_native, this::id_class, string -> string.length() < 1024 && this.id_super.id_break((String)string, 114) <= 128);
    private final ux_3 id_try = new ux_3(() -> this.id_goto, string -> {
        this.id_goto = string;
    }, this::id_native, this::id_class, string -> string.length() < 16);
    private long id_instanceof;
    private int id_throw = -1;
    private Ln_1 id_interface;
    private Ln_1 id_char;
    private LF id_abstract;
    private LF id_long;
    private LF id_float;
    private LF id_boolean;
    private final rpm_3 id_transient;
    private Zh_1 id_for = Zh_1.id_class;
    private rgP_2 id_double = rgN_2.id_byte;
    private final rgP_2 id_switch;

    private void id_char() {
        ListIterator<String> listIterator = this.id_public.listIterator(this.id_public.size());
        while (listIterator.hasPrevious() && listIterator.previous().isEmpty()) {
            listIterator.remove();
        }
    }

    private void id_byte(String string) {
        if (this.id_return >= 0 && this.id_return < this.id_public.size()) {
            this.id_public.set(this.id_return, string);
            this.id_finally = true;
            this.id_default();
        }
    }

    private void id_byte(boolean bl) {
        if (this.id_finally) {
            this.id_char();
            rcy_3 rcy_32 = new rcy_3();
            this.id_public.stream().map(rca_3::id_class).forEach(rcy_32::add);
            if (!this.id_public.isEmpty()) {
                this.id_implements.id_class("pages", rcy_32);
            }
            if (bl) {
                this.id_implements.id_class("author", rca_3.id_class(this.id_private.sv().getName()));
                this.id_implements.id_class("title", rca_3.id_class(this.id_goto.trim()));
            }
            int n = this.id_transient == rpm_3.MAIN_HAND ? ((rhz_3)this.id_private.id_implements[1]).id_protected : 40;
            this.id_volatile.id_void().id_class(new rmo_3(this.id_implements, bl, n));
        }
    }

    private boolean id_byte(int n, int n2, int n3) {
        if (vm_3.id_private(n)) {
            this.id_while.id_protected();
            return true;
        }
        if (vm_3.id_catch(n)) {
            this.id_while.id_byte();
            return true;
        }
        if (vm_3.id_case(n)) {
            this.id_while.id_break();
            return true;
        }
        if (vm_3.id_throws(n)) {
            this.id_while.id_class();
            return true;
        }
        switch (n) {
            case 257: 
            case 335: {
                this.id_while.id_class("\n");
                return true;
            }
            case 259: {
                this.id_while.id_break(-1);
                return true;
            }
            case 261: {
                this.id_while.id_break(1);
                return true;
            }
            case 262: {
                this.id_while.id_class(1, vm_3.id_synchronized());
                return true;
            }
            case 263: {
                this.id_while.id_class(-1, vm_3.id_synchronized());
                return true;
            }
            case 264: {
                this.id_float();
                return true;
            }
            case 265: {
                this.id_long();
                return true;
            }
            case 266: {
                this.id_char.id_catch();
                return true;
            }
            case 267: {
                this.id_interface.id_catch();
                return true;
            }
            case 268: {
                this.id_void();
                return true;
            }
            case 269: {
                this.id_static();
                return true;
            }
        }
        return false;
    }

    private void id_byte(int n) {
        String string = this.id_import();
        this.id_while.id_class(rVj_1.id_class(string, -1, n, false), rVj_1.id_class(string, 1, n, false));
    }

    private void id_int() {
        if (this.id_return < this.id_final() - 1) {
            ++this.id_return;
        } else {
            this.id_abstract();
            if (this.id_return < this.id_final() - 1) {
                ++this.id_return;
            }
        }
        this.id_interface();
        this.id_const();
    }

    private void id_long() {
        this.id_break(-1);
    }

    private void id_float() {
        this.id_break(1);
    }

    public ZM(rhd_3 rhd_32, rdn_3 rdn_32, rpm_3 rpm_32) {
        super(rgN_2.id_byte);
        this.id_private = rhd_32;
        this.id_implements = rdn_32;
        this.id_transient = rpm_32;
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null) {
            rcy_3 rcy_32 = rcd_32.id_protected("pages", 8).id_protected();
            for (int i = 0; i < rcy_32.size(); ++i) {
                this.id_public.add(rcy_32.id_implements(i));
            }
        }
        if (this.id_public.isEmpty()) {
            this.id_public.add("");
        }
        this.id_switch = new rgn_3("book.byAuthor", rhd_32.g()).id_class(rgF_2.DARK_GRAY);
        vs_3.INSTANCE.id_class(this);
    }

    private void id_interface() {
        this.id_char.id_new = !this.id_else && this.id_return > 0;
        this.id_interface.id_new = !this.id_else;
        this.id_abstract.id_new = !this.id_else;
        this.id_long.id_new = !this.id_else;
        this.id_boolean.id_new = this.id_else;
        this.id_float.id_new = this.id_else;
        this.id_float.id_int = !this.id_goto.trim().isEmpty();
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_class((cC_2)null);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_volatile.A().id_class(vz_3.id_throws);
        int n3 = (this.id_package - 192) / 2;
        int n4 = 2;
        this.id_break(ml_1, n3, 2, 0, 0, 192, 192);
        if (this.id_else) {
            boolean bl = this.id_synchronized / 6 % 2 == 0;
            rpl_3 rpl_32 = rpl_3.id_class(rpl_3.id_class(this.id_goto, rgc_3.id_class), bl ? id_case : id_catch);
            int n5 = this.id_super.id_class(id_class);
            this.id_super.id_byte(ml_1, id_class, n3 + 36 + (114 - n5) / 2, 34.0f, 0);
            int n6 = this.id_super.id_class(rpl_32);
            this.id_super.id_break(ml_1, rpl_32, (float)(n3 + 36 + (114 - n6) / 2), 50.0f, 0);
            int n7 = this.id_super.id_class(this.id_switch);
            this.id_super.id_byte(ml_1, this.id_switch, n3 + 36 + (114 - n7) / 2, 60.0f, 0);
            this.id_super.id_class(id_throws, n3 + 36, 82, 114, 0);
        } else {
            int n8 = this.id_super.id_class(this.id_double);
            this.id_super.id_byte(ml_1, this.id_double, n3 - n8 + 192 - 44, 18.0f, 0);
            Zh_1 zh_1 = this.id_short();
            for (ZO zO : zh_1.id_case) {
                this.id_super.id_byte(ml_1, zO.id_byte, zO.id_protected, zO.id_throws, -16777216);
            }
            this.id_class(zh_1.id_catch);
            this.id_class(ml_1, zh_1.id_byte, zh_1.id_protected);
        }
        super.id_class(ml_1, n, n2, f);
    }

    public static int id_class(int[] nArray, int n) {
        int n2 = Arrays.binarySearch(nArray, n);
        return n2 < 0 ? -(n2 + 2) : n2;
    }

    private HZ id_class(String string, rVj_1 rVj_12, int n, int n2, int n3, int n4) {
        String string2 = string.substring(n4, n);
        String string3 = string.substring(n4, n2);
        ZX zX = new ZX((int)rVj_12.id_class(string2), n3);
        ZX zX2 = new ZX((int)rVj_12.id_class(string3), n3 + 9);
        return this.id_class(zX, zX2);
    }

    private HZ id_class(ZX zX, ZX zX2) {
        ZX zX3 = this.id_break(zX);
        ZX zX4 = this.id_break(zX2);
        int n = Math.min(zX3.id_class, zX4.id_class);
        int n2 = Math.max(zX3.id_class, zX4.id_class);
        int n3 = Math.min(zX3.id_break, zX4.id_break);
        int n4 = Math.max(zX3.id_break, zX4.id_break);
        return new HZ(n, n3, n2 - n, n4 - n3);
    }

    private void id_class(Ml_1 ml_1, ZX zX, boolean bl) {
        if (this.id_synchronized / 6 % 2 == 0) {
            zX = this.id_break(zX);
            if (!bl) {
                ch_3.id_class(ml_1, zX.id_class, zX.id_break - 1, zX.id_class + 1, zX.id_break + 9, -16777216);
            } else {
                this.id_super.id_break(ml_1, "_", (float)zX.id_class, (float)zX.id_break, 0);
            }
        }
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (super.id_class(d, d2, n, d3, d4)) {
            return true;
        }
        if (n == 0) {
            Zh_1 zh_1 = this.id_short();
            int n2 = zh_1.id_class(this.id_super, this.id_class(new ZX((int)d, (int)d2)));
            this.id_while.id_byte(n2, true);
            this.id_default();
        }
        return true;
    }

    private ZX id_class(ZX zX) {
        return new ZX(zX.id_class - (this.id_package - 192) / 2 - 36, zX.id_break - 32);
    }

    private void id_class(String string) {
        if (this.id_volatile != null) {
            ux_3.id_class(this.id_volatile, string);
        }
    }

    @Override
    public boolean id_class(char c, int n) {
        if (super.id_class(c, n)) {
            return true;
        }
        if (this.id_else) {
            boolean bl = this.id_try.id_class(c);
            if (bl) {
                this.id_interface();
                this.id_finally = true;
                return true;
            }
            return false;
        }
        if (rqu_3.id_class(c)) {
            this.id_while.id_class(Character.toString(c));
            this.id_default();
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (this.id_else) {
            return this.id_protected(n, n2, n3);
        }
        boolean bl = this.id_byte(n, n2, n3);
        if (bl) {
            this.id_default();
            return true;
        }
        return false;
    }

    private void id_class(HZ[] hZArray) {
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        RenderSystem.color4f(0.0f, 0.0f, 255.0f, 255.0f);
        RenderSystem.disableTexture();
        RenderSystem.enableColorLogicOp();
        RenderSystem.logicOp(Ma_1.OR_REVERSE);
        lD_22.id_class(7, ju_3.id_super);
        for (HZ hZ : hZArray) {
            int n = hZ.id_class();
            int n2 = hZ.id_break();
            int n3 = n + hZ.id_byte();
            int n4 = n2 + hZ.id_protected();
            lD_22.id_class((double)n, (double)n4, 0.0).id_class();
            lD_22.id_class((double)n3, (double)n4, 0.0).id_class();
            lD_22.id_class((double)n3, (double)n2, 0.0).id_class();
            lD_22.id_class((double)n, (double)n2, 0.0).id_class();
        }
        yb_32.id_break();
        RenderSystem.disableColorLogicOp();
        RenderSystem.enableTexture();
    }

    private /* synthetic */ void id_class(MutableInt mutableInt, String string, MutableBoolean mutableBoolean, IntList intList, List list, rgc_3 rgc_32, int n, int n2) {
        int n3 = mutableInt.getAndIncrement();
        String string2 = string.substring(n, n2);
        mutableBoolean.setValue(string2.endsWith("\n"));
        String string3 = StringUtils.stripEnd((String)string2, (String)" \n");
        int n4 = n3 * 9;
        ZX zX = this.id_break(new ZX(0, n4));
        intList.add(n);
        list.add(new ZO(rgc_32, string3, zX.id_class, zX.id_break));
    }

    private void id_default() {
        this.id_for = null;
    }

    private Zh_1 id_short() {
        if (this.id_for == null) {
            this.id_for = this.id_strictfp();
            this.id_double = new rgn_3("book.pageIndicator", this.id_return + 1, this.id_final());
        }
        return this.id_for;
    }

    private void id_void() {
        int n = this.id_while.id_case();
        int n2 = this.id_short().id_class(n);
        this.id_while.id_byte(n2, vm_3.id_synchronized());
    }

    private void id_break(int n) {
        int n2 = this.id_while.id_case();
        int n3 = this.id_short().id_class(n2, n);
        this.id_while.id_byte(n3, vm_3.id_synchronized());
    }

    private ZX id_break(ZX zX) {
        return new ZX(zX.id_class + (this.id_package - 192) / 2 + 36, zX.id_break + 32);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (super.id_break(d, d2, n)) {
            return true;
        }
        if (n == 0) {
            long l = rqR_2.id_break();
            Zh_1 zh_1 = this.id_short();
            int n2 = zh_1.id_class(this.id_super, this.id_class(new ZX((int)d, (int)d2)));
            if (n2 >= 0) {
                if (n2 == this.id_throw && l - this.id_instanceof < 250L) {
                    if (!this.id_while.id_private()) {
                        this.id_byte(n2);
                    } else {
                        this.id_while.id_protected();
                    }
                } else {
                    this.id_while.id_byte(n2, vm_3.id_synchronized());
                }
                this.id_default();
            }
            this.id_throw = n2;
            this.id_instanceof = l;
        }
        return true;
    }

    private void id_const() {
        this.id_while.id_throws();
        this.id_default();
    }

    private String id_import() {
        return this.id_return >= 0 && this.id_return < this.id_public.size() ? this.id_public.get(this.id_return) : "";
    }

    private void id_package() {
        if (this.id_return > 0) {
            --this.id_return;
        }
        this.id_interface();
        this.id_const();
    }

    private void id_static() {
        Zh_1 zh_1 = this.id_short();
        int n = this.id_while.id_case();
        int n2 = zh_1.id_break(n);
        this.id_while.id_byte(n2, vm_3.id_synchronized());
    }

    private boolean id_protected(int n, int n2, int n3) {
        switch (n) {
            case 257: 
            case 335: {
                if (!this.id_goto.isEmpty()) {
                    this.id_byte(true);
                    this.id_volatile.id_break((vm_3)null);
                }
                return true;
            }
            case 259: {
                this.id_try.id_break(-1);
                this.id_interface();
                this.id_finally = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public void id_private() {
        super.id_private();
        ++this.id_synchronized;
    }

    private void id_abstract() {
        if (this.id_final() < 100) {
            this.id_public.add("");
            this.id_finally = true;
        }
    }

    private int id_final() {
        return this.id_public.size();
    }

    private String id_native() {
        return this.id_volatile != null ? ux_3.id_break(this.id_volatile) : "";
    }

    private Zh_1 id_strictfp() {
        int n;
        ZX zX;
        boolean bl;
        String string = this.id_import();
        if (string.isEmpty()) {
            return Zh_1.id_class;
        }
        int n2 = this.id_while.id_case();
        int n3 = this.id_while.id_catch();
        IntArrayList intArrayList = new IntArrayList();
        ArrayList arrayList = Lists.newArrayList();
        MutableInt mutableInt = new MutableInt();
        MutableBoolean mutableBoolean = new MutableBoolean();
        rVj_1 rVj_12 = this.id_super.id_break();
        rVj_12.id_class(string, 114, rgc_3.id_class, true, (arg_0, arg_1, arg_2) -> this.id_class(mutableInt, string, mutableBoolean, (IntList)intArrayList, arrayList, arg_0, arg_1, arg_2));
        int[] nArray = intArrayList.toIntArray();
        boolean bl2 = bl = n2 == string.length();
        if (bl && mutableBoolean.isTrue()) {
            zX = new ZX(0, arrayList.size() * 9);
        } else {
            int n4 = ZM.id_class(nArray, n2);
            n = this.id_super.id_break(string.substring(nArray[n4], n2));
            zX = new ZX(n, n4 * 9);
        }
        ArrayList arrayList2 = Lists.newArrayList();
        if (n2 != n3) {
            int n5;
            n = Math.min(n2, n3);
            int n6 = Math.max(n2, n3);
            int n7 = ZM.id_class(nArray, n);
            if (n7 == (n5 = ZM.id_class(nArray, n6))) {
                int n8 = n7 * 9;
                int n9 = nArray[n7];
                arrayList2.add(this.id_class(string, rVj_12, n, n6, n8, n9));
            } else {
                int n10 = n7 + 1 > nArray.length ? string.length() : nArray[n7 + 1];
                arrayList2.add(this.id_class(string, rVj_12, n, n10, n7 * 9, nArray[n7]));
                for (int i = n7 + 1; i < n5; ++i) {
                    int n11 = i * 9;
                    String string2 = string.substring(nArray[i], nArray[i + 1]);
                    int n12 = (int)rVj_12.id_class(string2);
                    arrayList2.add(this.id_class(new ZX(0, n11), new ZX(n12, n11 + 9)));
                }
                arrayList2.add(this.id_class(string, rVj_12, nArray[n5], n6, n5 * 9, nArray[n5]));
            }
        }
        return new Zh_1(string, zX, bl, nArray, arrayList.toArray(new ZO[0]), arrayList2.toArray(new HZ[0]));
    }

    @Override
    public boolean aO_() {
        return true;
    }

    @Override
    protected void v_() {
        this.id_default();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_long = this.id_class(new LF(this.id_package / 2 - 100, 196, 98, 20, new rgn_3("book.signButton"), lF -> {
            this.id_else = true;
            this.id_interface();
        }));
        this.id_abstract = this.id_class(new LF(this.id_package / 2 + 2, 196, 98, 20, cN_2.id_byte, lF -> {
            this.id_volatile.id_break((vm_3)null);
            this.id_byte(false);
        }));
        this.id_float = this.id_class(new LF(this.id_package / 2 - 100, 196, 98, 20, new rgn_3("book.finalizeButton"), lF -> {
            if (this.id_else) {
                this.id_byte(true);
                this.id_volatile.id_break((vm_3)null);
            }
        }));
        this.id_boolean = this.id_class(new LF(this.id_package / 2 + 2, 196, 98, 20, cN_2.id_protected, lF -> {
            if (this.id_else) {
                this.id_else = false;
            }
            this.id_interface();
        }));
        int n = (this.id_package - 192) / 2;
        int n2 = 2;
        this.id_interface = this.id_class(new Ln_1(n + 116, 159, true, lF -> this.id_int(), true));
        this.id_char = this.id_class(new Ln_1(n + 43, 159, false, lF -> this.id_package(), true));
        this.id_interface();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

