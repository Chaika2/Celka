/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.iB_2;
import celestial.rCD;
import celestial.rFy_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rhd_3;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqX_2;
import celestial.rqd_3;
import celestial.rql_3;
import celestial.rrEm_1;
import celestial.rrPN;
import celestial.rrPd_1;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zx_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ryG_2
extends ryO_2 {
    private rqO_2 id_class;
    private String id_break = "";
    private String id_byte = "";
    private rfH_2 id_protected = new rfH_2(0, 1, 0);
    private rfH_2 id_throws = rfH_2.id_protected;
    private rpa_3 id_case = rpa_3.NONE;
    private rqd_3 id_catch = rqd_3.NONE;
    private rCD id_private = rCD.DATA;
    private boolean id_implements = true;
    private boolean id_finally;
    private boolean id_final;
    private boolean id_package = true;
    private float id_int = 1.0f;
    private long id_new;

    public void id_byte(boolean bl) {
        this.id_finally = bl;
    }

    public ryG_2() {
        super(ryW_2.id_this);
    }

    public long id_this() {
        return this.id_new;
    }

    public void id_class(rCD rCD2) {
        this.id_private = rCD2;
        xc_3 xc_32 = this.id_extends.id_byte(this.id_char());
        if (xc_32.id_class(xu_3.Js)) {
            this.id_extends.id_class(this.id_char(), (xc_3)xc_32.id_class(zx_3.id_volatile, rCD2), 2);
        }
    }

    public void id_class(float f) {
        this.id_int = f;
    }

    public void id_class(boolean bl) {
        this.id_implements = bl;
    }

    public void id_class(rpa_3 rpa_32) {
        this.id_case = rpa_32;
    }

    public void id_class(rqd_3 rqd_32) {
        this.id_catch = rqd_32;
    }

    private rfi_3 id_class(rfH_2 rfH_22, List<ryG_2> list) {
        rfi_3 rfi_32;
        if (list.size() > 1) {
            rfH_2 rfH_23 = list.get(0).id_char();
            rfi_32 = new rfi_3(rfH_23, rfH_23);
        } else {
            rfi_32 = new rfi_3(rfH_22, rfH_22);
        }
        for (ryG_2 ryG_22 : list) {
            rfH_2 rfH_24 = ryG_22.id_char();
            if (rfH_24.b_() < rfi_32.id_class) {
                rfi_32.id_class = rfH_24.b_();
            } else if (rfH_24.b_() > rfi_32.id_protected) {
                rfi_32.id_protected = rfH_24.b_();
            }
            if (rfH_24.c_() < rfi_32.id_break) {
                rfi_32.id_break = rfH_24.c_();
            } else if (rfH_24.c_() > rfi_32.id_throws) {
                rfi_32.id_throws = rfH_24.c_();
            }
            if (rfH_24.d_() < rfi_32.id_byte) {
                rfi_32.id_byte = rfH_24.d_();
                continue;
            }
            if (rfH_24.d_() <= rfi_32.id_case) continue;
            rfi_32.id_case = rfH_24.d_();
        }
        return rfi_32;
    }

    public boolean id_class(rrEm_1 rrEm_12) {
        return this.id_class(rrEm_12, true);
    }

    public boolean id_class(rrEm_1 rrEm_12, boolean bl) {
        if (this.id_private == rCD.LOAD && this.id_class != null) {
            rrPl_1 rrPl_12;
            rrPt_1 rrPt_12 = rrEm_12.O();
            try {
                rrPl_12 = rrPt_12.id_break(this.id_class);
            }
            catch (rqX_2 rqX_22) {
                return false;
            }
            return rrPl_12 == null ? false : this.id_class(rrEm_12, bl, rrPl_12);
        }
        return false;
    }

    public boolean id_class(rrEm_1 rrEm_12, boolean bl, rrPl_1 rrPl_12) {
        Object object;
        rfH_2 rfH_22;
        boolean bl2;
        rfH_2 rfH_23 = this.id_char();
        if (!rql_3.id_break(rrPl_12.id_break())) {
            this.id_break = rrPl_12.id_break();
        }
        if (!(bl2 = this.id_throws.equals(rfH_22 = rrPl_12.id_class()))) {
            this.id_throws = rfH_22;
            this.id_break();
            object = rrEm_12.id_byte(rfH_23);
            rrEm_12.id_class(rfH_23, (xc_3)object, (xc_3)object, 3);
        }
        if (bl && !bl2) {
            return false;
        }
        object = new rrPN().id_class(this.id_case).id_class(this.id_catch).id_class(this.id_implements).id_class((rfj_3)null);
        if (this.id_int < 1.0f) {
            ((rrPN)object).id_break().id_class(new rrPd_1(rfU_2.id_class(this.id_int, 0.0f, 1.0f))).id_class(ryG_2.id_break(this.id_new));
        }
        rfH_2 rfH_24 = rfH_23.id_break(this.id_protected);
        rrPl_12.id_class(rrEm_12, rfH_24, (rrPN)object, ryG_2.id_break(this.id_new));
        return true;
    }

    private List<ryG_2> id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        ArrayList arrayList = Lists.newArrayList();
        for (rfH_2 rfH_24 : rfH_2.id_class(rfH_22, rfH_23)) {
            ryO_2 ryO_22;
            xc_3 xc_32 = this.id_extends.id_byte(rfH_24);
            if (!xc_32.id_class(xu_3.Js) || (ryO_22 = this.id_extends.id_class(rfH_24)) == null || !(ryO_22 instanceof ryG_2)) continue;
            arrayList.add((ryG_2)ryO_22);
        }
        return arrayList;
    }

    private List<ryG_2> id_class(List<ryG_2> list) {
        Predicate<ryG_2> predicate = ryG_22 -> ryG_22.id_private == rCD.CORNER && Objects.equals(this.id_class, ryG_22.id_class);
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    public void id_class(long l) {
        this.id_new = l;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("name", this.id_throws());
        rcd_32.id_class("author", this.id_break);
        rcd_32.id_class("metadata", this.id_byte);
        rcd_32.id_break("posX", this.id_protected.b_());
        rcd_32.id_break("posY", this.id_protected.c_());
        rcd_32.id_break("posZ", this.id_protected.d_());
        rcd_32.id_break("sizeX", this.id_throws.b_());
        rcd_32.id_break("sizeY", this.id_throws.c_());
        rcd_32.id_break("sizeZ", this.id_throws.d_());
        rcd_32.id_class("rotation", this.id_catch.toString());
        rcd_32.id_class("mirror", this.id_case.toString());
        rcd_32.id_class("mode", this.id_private.toString());
        rcd_32.id_class("ignoreEntities", this.id_implements);
        rcd_32.id_class("powered", this.id_finally);
        rcd_32.id_class("showair", this.id_final);
        rcd_32.id_class("showboundingbox", this.id_package);
        rcd_32.id_class("integrity", this.id_int);
        rcd_32.id_class("seed", this.id_new);
        return rcd_32;
    }

    public void id_class(rqO_2 rqO_22) {
        this.id_class = rqO_22;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class(rcd_32.id_native("name"));
        this.id_break = rcd_32.id_native("author");
        this.id_byte = rcd_32.id_native("metadata");
        int n = rfU_2.id_class(rcd_32.id_private("posX"), -48, 48);
        int n2 = rfU_2.id_class(rcd_32.id_private("posY"), -48, 48);
        int n3 = rfU_2.id_class(rcd_32.id_private("posZ"), -48, 48);
        this.id_protected = new rfH_2(n, n2, n3);
        int n4 = rfU_2.id_class(rcd_32.id_private("sizeX"), 0, 48);
        int n5 = rfU_2.id_class(rcd_32.id_private("sizeY"), 0, 48);
        int n6 = rfU_2.id_class(rcd_32.id_private("sizeZ"), 0, 48);
        this.id_throws = new rfH_2(n4, n5, n6);
        try {
            this.id_catch = rqd_3.valueOf(rcd_32.id_native("rotation"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.id_catch = rqd_3.NONE;
        }
        try {
            this.id_case = rpa_3.valueOf(rcd_32.id_native("mirror"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.id_case = rpa_3.NONE;
        }
        try {
            this.id_private = rCD.valueOf(rcd_32.id_native("mode"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.id_private = rCD.DATA;
        }
        this.id_implements = rcd_32.id_new("ignoreEntities");
        this.id_finally = rcd_32.id_new("powered");
        this.id_final = rcd_32.id_new("showair");
        this.id_package = rcd_32.id_new("showboundingbox");
        this.id_int = rcd_32.id_throws("integrity") ? rcd_32.id_finally("integrity") : 1.0f;
        this.id_new = rcd_32.id_implements("seed");
        this.id_throw();
    }

    public void id_class(iB_2 iB_22) {
        this.id_break = iB_22.g().getString();
    }

    public boolean id_class(rhd_3 rhd_32) {
        if (!rhd_32.sU()) {
            return false;
        }
        if (rhd_32.e().id_continue) {
            rhd_32.id_class(this);
        }
        return true;
    }

    public void id_class(String string) {
        this.id_class(rql_3.id_break(string) ? null : rqO_2.id_break(string));
    }

    public void id_class(rfH_2 rfH_22) {
        this.id_protected = rfH_22;
    }

    public boolean id_break(boolean bl) {
        if (this.id_private == rCD.SAVE && !this.id_extends.id_continue && this.id_class != null) {
            rrPl_1 rrPl_12;
            rfH_2 rfH_22 = this.id_char().id_break(this.id_protected);
            rrEm_1 rrEm_12 = (rrEm_1)this.id_extends;
            rrPt_1 rrPt_12 = rrEm_12.O();
            try {
                rrPl_12 = rrPt_12.id_class(this.id_class);
            }
            catch (rqX_2 rqX_22) {
                return false;
            }
            rrPl_12.id_class(this.id_extends, rfH_22, this.id_throws, !this.id_implements, xu_3.bo);
            rrPl_12.id_class(this.id_break);
            if (bl) {
                try {
                    return rrPt_12.id_byte(this.id_class);
                }
                catch (rqX_2 rqX_23) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static Random id_break(long l) {
        return l == 0L ? new Random(rqR_2.id_break()) : new Random(l);
    }

    public void id_break(rfH_2 rfH_22) {
        this.id_throws = rfH_22;
    }

    public void id_break(String string) {
        this.id_byte = string;
    }

    public String id_throws() {
        return this.id_class == null ? "" : this.id_class.toString();
    }

    public void id_throws(boolean bl) {
        this.id_package = bl;
    }

    public rfH_2 id_finally() {
        return this.id_protected;
    }

    public String id_catch() {
        return this.id_class == null ? "" : this.id_class.id_break();
    }

    public rfH_2 id_extends() {
        return this.id_throws;
    }

    public boolean id_goto() {
        return this.id_finally;
    }

    public boolean id_continue() {
        return this.id_implements;
    }

    public boolean id_else() {
        rfH_2 rfH_22;
        if (this.id_private != rCD.SAVE) {
            return false;
        }
        rfH_2 rfH_23 = this.id_char();
        int n = 80;
        rfH_2 rfH_24 = new rfH_2(rfH_23.b_() - 80, 0, rfH_23.d_() - 80);
        List<ryG_2> list = this.id_class(rfH_24, rfH_22 = new rfH_2(rfH_23.b_() + 80, 255, rfH_23.d_() + 80));
        List<ryG_2> list2 = this.id_class(list);
        if (list2.size() < 1) {
            return false;
        }
        rfi_3 rfi_32 = this.id_class(rfH_23, list2);
        if (rfi_32.id_protected - rfi_32.id_class > 1 && rfi_32.id_throws - rfi_32.id_break > 1 && rfi_32.id_case - rfi_32.id_byte > 1) {
            this.id_protected = new rfH_2(rfi_32.id_class - rfH_23.b_() + 1, rfi_32.id_break - rfH_23.c_() + 1, rfi_32.id_byte - rfH_23.d_() + 1);
            this.id_throws = new rfH_2(rfi_32.id_protected - rfi_32.id_class - 1, rfi_32.id_throws - rfi_32.id_break - 1, rfi_32.id_case - rfi_32.id_byte - 1);
            this.id_break();
            xc_3 xc_32 = this.id_extends.id_byte(rfH_23);
            this.id_extends.id_class(rfH_23, xc_32, xc_32, 3);
            return true;
        }
        return false;
    }

    @Override
    public double id_implements() {
        return 96.0;
    }

    public boolean id_instanceof() {
        return this.id_package;
    }

    public void id_new() {
        switch (this.id_package()) {
            case SAVE: {
                this.id_class(rCD.LOAD);
                break;
            }
            case LOAD: {
                this.id_class(rCD.CORNER);
                break;
            }
            case CORNER: {
                this.id_class(rCD.DATA);
                break;
            }
            case DATA: {
                this.id_class(rCD.SAVE);
            }
        }
    }

    public rCD id_package() {
        return this.id_private;
    }

    public void id_return() {
        if (this.id_class != null) {
            rrEm_1 rrEm_12 = (rrEm_1)this.id_extends;
            rrPt_1 rrPt_12 = rrEm_12.O();
            rrPt_12.id_protected(this.id_class);
        }
    }

    public float id_super() {
        return this.id_int;
    }

    private void id_throw() {
        rfH_2 rfH_22;
        xc_3 xc_32;
        if (this.id_extends != null && (xc_32 = this.id_extends.id_byte(rfH_22 = this.id_char())).id_class(xu_3.Js)) {
            this.id_extends.id_class(rfH_22, (xc_3)xc_32.id_class(zx_3.id_volatile, this.id_private), 2);
        }
    }

    public boolean id_try() {
        return this.id_final;
    }

    public boolean id_public() {
        if (this.id_private == rCD.LOAD && !this.id_extends.id_continue && this.id_class != null) {
            rrEm_1 rrEm_12 = (rrEm_1)this.id_extends;
            rrPt_1 rrPt_12 = rrEm_12.O();
            try {
                return rrPt_12.id_break(this.id_class) != null;
            }
            catch (rqX_2 rqX_22) {
                return false;
            }
        }
        return false;
    }

    public void id_protected(boolean bl) {
        this.id_final = bl;
    }

    public boolean id_private() {
        return this.id_class != null;
    }

    public String id_final() {
        return this.id_byte;
    }

    public rqd_3 id_volatile() {
        return this.id_catch;
    }

    public boolean id_synchronized() {
        return this.id_break(true);
    }

    public rpa_3 id_native() {
        return this.id_case;
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 7, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        return this.id_class(new rcd_3());
    }
}

