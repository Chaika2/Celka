/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.LF;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.ZH;
import celestial.Zy_1;
import celestial.cN_2;
import celestial.mg_3;
import celestial.rKN;
import celestial.rKQ;
import celestial.rVF;
import celestial.rVL;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpL_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrSI;
import celestial.rrSq_1;
import celestial.rrrZ;
import celestial.vm_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Zl_1
extends vm_3 {
    private static final Logger id_class = LogManager.getLogger();
    public static final List<ZH> id_throws = Lists.newArrayList();
    public final mg_3 id_case;
    private rgP_2 id_catch;
    private rgP_2 id_private;
    private Zy_1 id_implements;
    private LF id_finally;
    public Lu_1 id_else;
    public rKQ id_synchronized;

    public void id_byte(boolean bl) {
        this.id_finally.id_int = bl || this.id_else.id_private().length() > 1;
    }

    public Zl_1(mg_3 mg_32) {
        super(new rgn_3("createWorld.customize.presets.title"));
        this.id_case = mg_32;
    }

    static {
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.classic_flat"), xu_3.id_implements, rYl_1.id_break, Arrays.asList(rrrZ.id_new), false, false, false, new rKN(1, xu_3.id_implements), new rKN(2, xu_3.id_finally), new rKN(1, xu_3.id_while));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.tunnelers_dream"), xu_3.id_break, rYl_1.id_protected, Arrays.asList(rrrZ.id_byte), true, true, false, new rKN(1, xu_3.id_implements), new rKN(5, xu_3.id_finally), new rKN(230, xu_3.id_break), new rKN(1, xu_3.id_while));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.water_world"), rdy_3.hR, rYl_1.id_goto, Arrays.asList(rrrZ.id_volatile, rrrZ.id_implements, rrrZ.id_native), false, false, false, new rKN(90, xu_3.id_try), new rKN(5, xu_3.id_throw), new rKN(5, xu_3.id_finally), new rKN(5, xu_3.id_break), new rKN(1, xu_3.id_while));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.overworld"), xu_3.e, rYl_1.id_break, Arrays.asList(rrrZ.id_new, rrrZ.id_byte, rrrZ.id_break, rrrZ.id_private), true, true, true, new rKN(1, xu_3.id_implements), new rKN(3, xu_3.id_finally), new rKN(59, xu_3.id_break), new rKN(1, xu_3.id_while));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.snowy_kingdom"), xu_3.Pq, rYl_1.id_volatile, Arrays.asList(rrrZ.id_new, rrrZ.id_catch), false, false, false, new rKN(1, xu_3.Pq), new rKN(1, xu_3.id_implements), new rKN(3, xu_3.id_finally), new rKN(59, xu_3.id_break), new rKN(1, xu_3.id_while));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.bottomless_pit"), rdy_3.Oi, rYl_1.id_break, Arrays.asList(rrrZ.id_new), false, false, false, new rKN(1, xu_3.id_implements), new rKN(3, xu_3.id_finally), new rKN(2, xu_3.id_volatile));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.desert"), xu_3.id_throw, rYl_1.id_byte, Arrays.asList(rrrZ.id_new, rrrZ.id_case, rrrZ.id_byte), true, true, false, new rKN(8, xu_3.id_throw), new rKN(52, xu_3.F), new rKN(3, xu_3.id_break), new rKN(1, xu_3.id_while));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.redstone_ready"), rdy_3.hD, rYl_1.id_byte, Collections.emptyList(), false, false, false, new rKN(52, xu_3.F), new rKN(3, xu_3.id_break), new rKN(1, xu_3.id_while));
        Zl_1.id_class(new rgn_3("createWorld.customize.preset.the_void"), xu_3.Ec, rYl_1.E, Collections.emptyList(), false, true, false, new rKN(1, xu_3.id_class));
    }

    private static void id_class(rgP_2 rgP_22, rpL_2 rpL_22, rqM_2<rYG> rqM_22, List<rrrZ<?>> list, boolean bl, boolean bl2, boolean bl3, rKN ... rKNArray) {
        id_throws.add(new ZH(rpL_22.id_case(), rgP_22, rVL2 -> {
            Object object2;
            HashMap hashMap = Maps.newHashMap();
            for (Object object2 : list) {
                hashMap.put(object2, (rrSI)rrSq_1.id_break.get(object2));
            }
            rrSq_1 rrSq_12 = new rrSq_1(bl ? Optional.of(rrSq_1.id_byte) : Optional.empty(), hashMap);
            object2 = new rKQ(rrSq_12, (rVL<rYG>)rVL2);
            if (bl2) {
                ((rKQ)object2).id_class();
            }
            if (bl3) {
                ((rKQ)object2).id_break();
            }
            for (int i = rKNArray.length - 1; i >= 0; --i) {
                ((rKQ)object2).id_case().add(rKNArray[i]);
            }
            ((rKQ)object2).id_class(() -> (rYG)rVL2.id_byte(rqM_22));
            ((rKQ)object2).id_private();
            return ((rKQ)object2).id_class(rrSq_12);
        }));
    }

    private static rKN id_class(String string, int n) {
        xd_3 xd_32;
        int n2;
        String[] stringArray = string.split("\\*", 2);
        if (stringArray.length == 2) {
            try {
                n2 = Math.max(Integer.parseInt(stringArray[0]), 0);
            }
            catch (NumberFormatException numberFormatException) {
                id_class.error("Error while parsing flat world string => {}", (Object)numberFormatException.getMessage());
                return null;
            }
        } else {
            n2 = 1;
        }
        int n3 = Math.min(n + n2, 256);
        int n4 = n3 - n;
        String string2 = stringArray[stringArray.length - 1];
        try {
            xd_32 = rVL.id_strictfp.id_break(new rqO_2(string2)).orElse(null);
        }
        catch (Exception exception) {
            id_class.error("Error while parsing flat world string => {}", (Object)exception.getMessage());
            return null;
        }
        if (xd_32 == null) {
            id_class.error("Error while parsing flat world string => Unknown block, {}", (Object)string2);
            return null;
        }
        rKN rKN2 = new rKN(n4, xd_32);
        rKN2.id_class(n);
        return rKN2;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_implements.id_class(ml_1, n, n2, f);
        RenderSystem.pushMatrix();
        RenderSystem.translatef(0.0f, 0.0f, 400.0f);
        Zl_1.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 8, 0xFFFFFF);
        Zl_1.id_break(ml_1, this.id_super, this.id_catch, 50, 30, 0xA0A0A0);
        Zl_1.id_break(ml_1, this.id_super, this.id_private, 50, 70, 0xA0A0A0);
        RenderSystem.popMatrix();
        this.id_else.id_class(ml_1, n, n2, f);
        super.id_class(ml_1, n, n2, f);
    }

    private static /* synthetic */ IllegalArgumentException id_class(rqO_2 rqO_22) {
        return new IllegalArgumentException("Invalid Biome: " + rqO_22);
    }

    public static String id_class(rVL<rYG> rVL2, rKQ rKQ2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rKQ2.id_case().size(); ++i) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(rKQ2.id_case().get(i));
        }
        stringBuilder.append(";");
        stringBuilder.append(rVL2.id_break(rKQ2.id_throws()));
        return stringBuilder.toString();
    }

    public static rKQ id_class(rVL<rYG> rVL2, String string, rKQ rKQ2) {
        Object object;
        Iterator iterator = Splitter.on((char)';').split((CharSequence)string).iterator();
        if (!iterator.hasNext()) {
            return rKQ.id_class(rVL2);
        }
        List<rKN> list = Zl_1.id_class((String)iterator.next());
        if (list.isEmpty()) {
            return rKQ.id_class(rVL2);
        }
        rKQ rKQ3 = rKQ2.id_class(list, rKQ2.id_protected());
        rqM_2<rYG> rqM_22 = rYl_1.id_break;
        if (iterator.hasNext()) {
            try {
                object = new rqO_2((String)iterator.next());
                rqM_22 = rqM_2.id_class(rVL.n, (rqO_2)object);
                rVL2.id_break(rqM_22).orElseThrow(() -> Zl_1.id_class((rqO_2)object));
            }
            catch (Exception exception) {
                id_class.error("Error while parsing flat world string => {}", (Object)exception.getMessage());
            }
        }
        object = rqM_22;
        rKQ3.id_class(() -> (rYG)rVL2.id_byte((rqM_2<rYG>)object));
        return rKQ3;
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_else.id_private();
        this.id_break(qY, n, n2);
        this.id_else.id_class(string);
    }

    private static List<rKN> id_class(String string) {
        ArrayList arrayList = Lists.newArrayList();
        String[] stringArray = string.split(",");
        int n = 0;
        for (String string2 : stringArray) {
            rKN rKN2 = Zl_1.id_class(string2, n);
            if (rKN2 == null) {
                return Collections.emptyList();
            }
            arrayList.add(rKN2);
            n += rKN2.id_class();
        }
        return arrayList;
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        return this.id_implements.id_class(d, d2, d3);
    }

    @Override
    public void id_private() {
        this.id_else.id_catch();
        super.id_private();
    }

    @Override
    public void id_volatile() {
        this.id_volatile.id_break(this.id_case);
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_catch = new rgn_3("createWorld.customize.presets.share");
        this.id_private = new rgn_3("createWorld.customize.presets.list");
        this.id_else = new Lu_1(this.id_super, 50, 40, this.id_package - 100, 20, this.id_catch);
        this.id_else.id_implements(1230);
        rVF<rYG> rVF2 = this.id_case.id_class.id_case.id_break().id_break(rVL.n);
        this.id_else.id_class(Zl_1.id_class(rVF2, this.id_case.id_finally()));
        this.id_synchronized = this.id_case.id_finally();
        this.id_native.add(this.id_else);
        this.id_implements = new Zy_1(this);
        this.id_native.add(this.id_implements);
        this.id_finally = this.id_class(new LF(this.id_package / 2 - 155, this.id_int - 28, 150, 20, new rgn_3("createWorld.customize.presets.select"), lF -> {
            rKQ rKQ2 = Zl_1.id_class(rVF2, this.id_else.id_private(), this.id_synchronized);
            this.id_case.id_class(rKQ2);
            this.id_volatile.id_break(this.id_case);
        }));
        this.id_class(new LF(this.id_package / 2 + 5, this.id_int - 28, 150, 20, cN_2.id_protected, lF -> this.id_volatile.id_break(this.id_case)));
        this.id_byte(this.id_implements.id_finally() != null);
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

