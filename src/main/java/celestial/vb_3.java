/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Function4
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.QK;
import celestial.QY;
import celestial.cN_2;
import celestial.rAL;
import celestial.rTH;
import celestial.rTM;
import celestial.rVm_1;
import celestial.rVv_1;
import celestial.rYB;
import celestial.rYE;
import celestial.rfU_2;
import celestial.rgn_3;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rrGP;
import celestial.rrGk_1;
import celestial.vm_3;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Function4;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vb_3
extends vm_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Object2IntMap<rqM_2<rYB>> id_throws = (Object2IntMap)rqR_2.id_class(new Object2IntOpenCustomHashMap(rqR_2.id_extends()), object2IntOpenCustomHashMap -> {
        object2IntOpenCustomHashMap.put(rYB.id_byte, -13408734);
        object2IntOpenCustomHashMap.put(rYB.id_protected, -10075085);
        object2IntOpenCustomHashMap.put(rYB.id_throws, -8943531);
        object2IntOpenCustomHashMap.defaultReturnValue(-2236963);
    });
    private final BooleanConsumer id_case;
    private final rTM id_catch;

    private vb_3(BooleanConsumer booleanConsumer, DataFixer dataFixer, rrGk_1 rrGk_12, rYE rYE2, boolean bl, ImmutableSet<rqM_2<rYB>> immutableSet) {
        super(new rgn_3("optimizeWorld.title", rYE2.id_class()));
        this.id_case = booleanConsumer;
        this.id_catch = new rTM(rrGk_12, dataFixer, immutableSet, bl);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        vb_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
        int n3 = this.id_package / 2 - 150;
        int n4 = this.id_package / 2 + 150;
        int n5 = this.id_int / 4 + 100;
        int n6 = n5 + 10;
        vb_3.id_class(ml_1, this.id_super, this.id_catch.id_private(), this.id_package / 2, n5 - 9 - 2, 0xA0A0A0);
        if (this.id_catch.id_throws() > 0) {
            vb_3.id_class(ml_1, n3 - 1, n5 - 1, n4 + 1, n6 + 1, -16777216);
            vb_3.id_break(ml_1, this.id_super, new rgn_3("optimizeWorld.info.converted", this.id_catch.id_case()), n3, 40, 0xA0A0A0);
            vb_3.id_break(ml_1, this.id_super, new rgn_3("optimizeWorld.info.skipped", this.id_catch.id_catch()), n3, 52, 0xA0A0A0);
            vb_3.id_break(ml_1, this.id_super, new rgn_3("optimizeWorld.info.total", this.id_catch.id_throws()), n3, 64, 0xA0A0A0);
            int n7 = 0;
            for (rqM_2 rqM_22 : this.id_catch.id_byte()) {
                int n8 = rfU_2.id_protected(this.id_catch.id_class(rqM_22) * (float)(n4 - n3));
                vb_3.id_class(ml_1, n3 + n7, n5, n3 + n7 + n8, n6, id_throws.getInt((Object)rqM_22));
                n7 += n8;
            }
            int n9 = this.id_catch.id_case() + this.id_catch.id_catch();
            vb_3.id_class(ml_1, this.id_super, n9 + " / " + this.id_catch.id_throws(), this.id_package / 2, n5 + 18 + 2, 0xA0A0A0);
            vb_3.id_class(ml_1, this.id_super, rfU_2.id_protected(this.id_catch.id_protected() * 100.0f) + "%", this.id_package / 2, n5 + (n6 - n5) / 2 - 4, 0xA0A0A0);
        }
        super.id_class(ml_1, n, n2, f);
    }

    public static vb_3 id_class(QY qY, BooleanConsumer booleanConsumer, DataFixer dataFixer, rrGk_1 rrGk_12, boolean bl) {
        rVv_1 rVv_12 = rVm_1.id_break();
        QK qK = qY.id_class(rVv_12, QY::id_class, (Function4<rrGk_1, rVv_1, rAL, rTH, rrGP>)((Function4)QY::id_class), false, rrGk_12);
        try {
            rrGP rrGP2 = qK.id_byte();
            rrGk_12.id_class(rVv_12, rrGP2);
            ImmutableSet<rqM_2<rYB>> immutableSet = rrGP2.id_long().id_case();
            vb_3 vb_32 = new vb_3(booleanConsumer, dataFixer, rrGk_12, rrGP2.id_throw(), bl, immutableSet);
            if (qK != null) {
                qK.close();
            }
            return vb_32;
        }
        catch (Throwable throwable) {
            try {
                if (qK != null) {
                    try {
                        qK.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
            catch (Exception exception) {
                id_class.warn("Failed to load datapacks, can't optimize world", (Throwable)exception);
                return null;
            }
        }
    }

    @Override
    public void id_private() {
        if (this.id_catch.id_break()) {
            this.id_case.accept(true);
        }
    }

    @Override
    public void id_volatile() {
        this.id_case.accept(false);
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 4 + 150, 200, 20, cN_2.id_protected, lF -> {
            this.id_catch.id_class();
            this.id_case.accept(false);
        }));
    }

    @Override
    public void w_() {
        super.w_();
        this.id_catch.id_class();
    }
}

