/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rKT;
import celestial.rKW;
import celestial.rKd_1;
import celestial.rRX;
import celestial.rVA;
import celestial.rVC;
import celestial.rVF;
import celestial.rVL;
import celestial.rVv_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYH;
import celestial.rYK;
import celestial.rYT;
import celestial.rYa_1;
import celestial.rYq_1;
import celestial.rfU_2;
import celestial.rlb_3;
import celestial.rls_3;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.xd_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.File;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Supplier;

public class rRJ {
    public static final rqO_2 id_class = new rqO_2("overworld");
    public static final rqO_2 id_break = new rqO_2("the_nether");
    public static final rqO_2 id_byte = new rqO_2("the_end");
    public static final Codec<rRJ> id_protected = RecordCodecBuilder.create(instance -> instance.group((App)Codec.LONG.optionalFieldOf("fixed_time").xmap(optional -> optional.map(OptionalLong::of).orElseGet(OptionalLong::empty), optionalLong -> optionalLong.isPresent() ? Optional.of(optionalLong.getAsLong()) : Optional.empty()).forGetter(rRJ2 -> rRJ2.id_package), (App)Codec.BOOL.fieldOf("has_skylight").forGetter(rRJ::id_break), (App)Codec.BOOL.fieldOf("has_ceiling").forGetter(rRJ::id_byte), (App)Codec.BOOL.fieldOf("ultrawarm").forGetter(rRJ::id_protected), (App)Codec.BOOL.fieldOf("natural").forGetter(rRJ::id_throws), (App)Codec.doubleRange((double)1.0E-5f, (double)3.0E7).fieldOf("coordinate_scale").forGetter(rRJ::id_case), (App)Codec.BOOL.fieldOf("piglin_safe").forGetter(rRJ::id_catch), (App)Codec.BOOL.fieldOf("bed_works").forGetter(rRJ::id_private), (App)Codec.BOOL.fieldOf("respawn_anchor_works").forGetter(rRJ::id_implements), (App)Codec.BOOL.fieldOf("has_raids").forGetter(rRJ::id_finally), (App)Codec.intRange((int)0, (int)256).fieldOf("logical_height").forGetter(rRJ::id_extends), (App)rqO_2.id_class.fieldOf("infiniburn").forGetter(rRJ2 -> rRJ2.id_instanceof), (App)rqO_2.id_class.fieldOf("effects").orElse((Object)id_class).forGetter(rRJ2 -> rRJ2.id_throw), (App)Codec.FLOAT.fieldOf("ambient_light").forGetter(rRJ2 -> Float.valueOf(rRJ2.id_interface))).apply((Applicative)instance, rRJ::new));
    public static final float[] id_throws = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    public static final rqM_2<rRJ> id_case = rqM_2.id_class(rVL.id_void, new rqO_2("overworld"));
    public static final rqM_2<rRJ> id_catch = rqM_2.id_class(rVL.id_void, new rqO_2("the_nether"));
    public static final rqM_2<rRJ> id_private = rqM_2.id_class(rVL.id_void, new rqO_2("the_end"));
    protected static final rRJ id_implements = new rRJ(OptionalLong.empty(), true, false, false, true, 1.0, false, false, true, false, true, 256, rYH.INSTANCE, rls_3.t.id_break(), id_class, 0.0f);
    protected static final rRJ id_finally = new rRJ(OptionalLong.of(18000L), false, true, true, false, 8.0, false, true, false, true, false, 128, rYq_1.INSTANCE, rls_3.w.id_break(), id_break, 0.1f);
    protected static final rRJ id_extends = new rRJ(OptionalLong.of(6000L), false, false, false, false, 1.0, true, false, false, false, true, 256, rYq_1.INSTANCE, rls_3.I.id_break(), id_byte, 0.0f);
    public static final rqM_2<rRJ> id_native = rqM_2.id_class(rVL.id_void, new rqO_2("overworld_caves"));
    protected static final rRJ id_volatile = new rRJ(OptionalLong.empty(), true, true, false, true, 1.0, false, false, true, false, true, 256, rYH.INSTANCE, rls_3.t.id_break(), id_class, 0.0f);
    public static final Codec<Supplier<rRJ>> id_final = rVA.id_class(rVL.id_void, id_protected);
    private final OptionalLong id_package;
    private final boolean id_int;
    private final boolean id_new;
    private final boolean id_continue;
    private final boolean id_super;
    private final double id_this;
    private final boolean id_else;
    private final boolean id_synchronized;
    private final boolean id_return;
    private final boolean id_public;
    private final boolean id_goto;
    private final int id_while;
    private final rYT id_try;
    private final rqO_2 id_instanceof;
    private final rqO_2 id_throw;
    private final float id_interface;
    private final transient float[] id_char;

    public boolean id_byte() {
        return this.id_new;
    }

    public rqO_2 id_int() {
        return this.id_throw;
    }

    protected rRJ(OptionalLong optionalLong, boolean bl, boolean bl2, boolean bl3, boolean bl4, double d, boolean bl5, boolean bl6, boolean bl7, boolean bl8, int n, rqO_2 rqO_22, rqO_2 rqO_23, float f) {
        this(optionalLong, bl, bl2, bl3, bl4, d, false, bl5, bl6, bl7, bl8, n, rYq_1.INSTANCE, rqO_22, rqO_23, f);
    }

    protected rRJ(OptionalLong optionalLong, boolean bl, boolean bl2, boolean bl3, boolean bl4, double d, boolean bl5, boolean bl6, boolean bl7, boolean bl8, boolean bl9, int n, rYT rYT2, rqO_2 rqO_22, rqO_2 rqO_23, float f) {
        this.id_package = optionalLong;
        this.id_int = bl;
        this.id_new = bl2;
        this.id_continue = bl3;
        this.id_super = bl4;
        this.id_this = d;
        this.id_else = bl5;
        this.id_synchronized = bl6;
        this.id_return = bl7;
        this.id_public = bl8;
        this.id_goto = bl9;
        this.id_while = n;
        this.id_try = rYT2;
        this.id_instanceof = rqO_22;
        this.id_throw = rqO_23;
        this.id_interface = f;
        this.id_char = rRJ.id_class(f);
    }

    public boolean id_class(rRJ rRJ2) {
        if (this == rRJ2) {
            return true;
        }
        return this.id_int == rRJ2.id_int && this.id_new == rRJ2.id_new && this.id_continue == rRJ2.id_continue && this.id_super == rRJ2.id_super && this.id_this == rRJ2.id_this && this.id_else == rRJ2.id_else && this.id_synchronized == rRJ2.id_synchronized && this.id_return == rRJ2.id_return && this.id_public == rRJ2.id_public && this.id_goto == rRJ2.id_goto && this.id_while == rRJ2.id_while && Float.compare(rRJ2.id_interface, this.id_interface) == 0 && this.id_package.equals(rRJ2.id_package) && this.id_try.equals(rRJ2.id_try) && this.id_instanceof.equals(rRJ2.id_instanceof) && this.id_throw.equals(rRJ2.id_throw);
    }

    public static rVv_1 id_class(rVv_1 rVv_12) {
        rVF<rRJ> rVF2 = rVv_12.id_break(rVL.id_void);
        rVF2.id_class(id_case, id_implements, Lifecycle.stable());
        rVF2.id_class(id_native, id_volatile, Lifecycle.stable());
        rVF2.id_class(id_catch, id_finally, Lifecycle.stable());
        rVF2.id_class(id_private, id_extends, Lifecycle.stable());
        return rVv_12;
    }

    public float id_class(int n) {
        return this.id_char[n];
    }

    public float id_class(long l) {
        double d = rfU_2.id_catch((double)this.id_package.orElse(l) / 24000.0 - 0.25);
        double d2 = 0.5 - Math.cos(d * Math.PI) / 2.0;
        return (float)(d * 2.0 + d2) / 3.0f;
    }

    private static rKd_1 id_class(rVL<rYG> rVL2, rVL<rKW> rVL3, long l) {
        return new rKT(new rYK(rVL2, l), l, () -> rVL3.id_byte(rKW.id_case));
    }

    private static float[] id_class(float f) {
        float[] fArray = new float[16];
        for (int i = 0; i <= 15; ++i) {
            float f2 = (float)i / 15.0f;
            float f3 = f2 / (4.0f - 3.0f * f2);
            fArray[i] = rfU_2.id_catch(f, f3, 1.0f);
        }
        return fArray;
    }

    @Deprecated
    public static DataResult<rqM_2<rYB>> id_class(Dynamic<?> dynamic) {
        Optional optional = dynamic.asNumber().result();
        if (optional.isPresent()) {
            int n = ((Number)optional.get()).intValue();
            if (n == -1) {
                return DataResult.success(rYB.id_protected);
            }
            if (n == 0) {
                return DataResult.success(rYB.id_byte);
            }
            if (n == 1) {
                return DataResult.success(rYB.id_throws);
            }
        }
        return rYB.id_break.parse(dynamic);
    }

    @Deprecated
    public String id_class() {
        return this.id_class(id_extends) ? "_end" : "";
    }

    public static rVC<rRX> id_class(rVL<rRJ> rVL2, rVL<rYG> rVL3, rVL<rKW> rVL4, long l) {
        rVC<rRX> rVC2 = new rVC<rRX>(rVL.id_import, Lifecycle.experimental());
        rVC2.id_class(rRX.id_byte, new rRX(() -> rVL2.id_byte(id_catch), rRJ.id_break(rVL3, rVL4, l)), Lifecycle.stable());
        rVC2.id_class(rRX.id_protected, new rRX(() -> rVL2.id_byte(id_private), rRJ.id_class(rVL3, rVL4, l)), Lifecycle.stable());
        return rVC2;
    }

    public static File id_class(rqM_2<rYB> rqM_22, File file) {
        if (rqM_22 == rYB.id_byte) {
            return file;
        }
        if (rqM_22 == rYB.id_throws) {
            return new File(file, "DIM1");
        }
        return rqM_22 == rYB.id_protected ? new File(file, "DIM-1") : new File(file, "dimensions/" + rqM_22.id_class().id_byte() + "/" + rqM_22.id_class().id_break());
    }

    public static double id_class(rRJ rRJ2, rRJ rRJ3) {
        double d = rRJ2.id_case();
        double d2 = rRJ3.id_case();
        return d / d2;
    }

    public int id_break(long l) {
        return (int)(l / 24000L % 8L + 8L) % 8;
    }

    public boolean id_break() {
        return this.id_int;
    }

    private static rKd_1 id_break(rVL<rYG> rVL2, rVL<rKW> rVL3, long l) {
        return new rKT(rYa_1.id_class.id_class(rVL2, l), l, () -> rVL3.id_byte(rKW.id_throws));
    }

    public boolean id_throws() {
        return this.id_super;
    }

    public boolean id_finally() {
        return this.id_goto;
    }

    public boolean id_catch() {
        return this.id_synchronized;
    }

    public int id_extends() {
        return this.id_while;
    }

    public double id_case() {
        return this.id_this;
    }

    public boolean id_implements() {
        return this.id_public;
    }

    public rlb_3<xd_3> id_package() {
        rlb_3<xd_3> rlb_32 = rls_3.id_class().id_class(this.id_instanceof);
        return rlb_32 != null ? rlb_32 : rls_3.t;
    }

    public boolean id_protected() {
        return this.id_continue;
    }

    public boolean id_private() {
        return this.id_return;
    }

    public boolean id_final() {
        return this.id_package.isPresent();
    }

    public rYT id_volatile() {
        return this.id_try;
    }

    public boolean id_native() {
        return this.id_else;
    }
}

