/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.IA;
import celestial.IC;
import celestial.IE;
import celestial.IF;
import celestial.IG;
import celestial.IJ;
import celestial.IL;
import celestial.IN;
import celestial.IO;
import celestial.IQ;
import celestial.IS;
import celestial.IY;
import celestial.IZ;
import celestial.Ib_1;
import celestial.Id_1;
import celestial.Ig_1;
import celestial.Ih_1;
import celestial.Ik_1;
import celestial.Iv_1;
import celestial.Ix_1;
import celestial.Iz_1;
import celestial.fJ_2;
import celestial.fQ_2;
import celestial.fj_3;
import celestial.rpY_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.wD_2;
import celestial.wK_2;
import celestial.wU_2;
import celestial.wa_3;
import celestial.wi_3;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class we_3
implements Id_1 {
    private static final Logger id_case = LogManager.getLogger();
    private static final Ih_1 id_catch = new Ih_1();
    public static final Gson id_class = new GsonBuilder().registerTypeAdapter(we_3.class, (Object)new wa_3()).registerTypeAdapter(IS.class, (Object)new IE()).registerTypeAdapter(IG.class, (Object)new Ib_1()).registerTypeAdapter(wD_2.class, (Object)new wU_2()).registerTypeAdapter(IL.class, (Object)new IA()).registerTypeAdapter(Ik_1.class, (Object)new Iz_1()).registerTypeAdapter(IZ.class, (Object)new Iv_1()).create();
    private final List<IS> id_private;
    private final wi_3 id_implements;
    private final boolean id_finally;
    private final Ik_1 id_extends;
    private final List<IZ> id_native;
    public String id_break = "";
    protected final Map<String, Either<Ig_1, String>> id_byte;
    protected we_3 id_protected;
    protected rqO_2 id_throws;

    public wi_3 id_byte() {
        if (this.id_implements != null) {
            return this.id_implements;
        }
        return this.id_protected != null ? this.id_protected.id_byte() : wi_3.SIDE;
    }

    public Ig_1 id_byte(String string) {
        if (we_3.id_throws(string)) {
            string = string.substring(1);
        }
        ArrayList arrayList = Lists.newArrayList();
        Either<Ig_1, String> either;
        Optional optional;
        while (!(optional = (either = this.id_protected(string)).left()).isPresent()) {
            string = (String)either.right().get();
            if (arrayList.contains(string)) {
                id_case.warn("Unable to resolve texture due to reference chain {}->{} in {}", (Object)Joiner.on((String)"->").join((Iterable)arrayList), (Object)string, (Object)this.id_break);
                return new Ig_1(fJ_2.id_class, fQ_2.id_class());
            }
            arrayList.add(string);
        }
        return (Ig_1)optional.get();
    }

    public we_3(rqO_2 rqO_22, List<IS> list, Map<String, Either<Ig_1, String>> map, boolean bl, wi_3 wi_32, Ik_1 ik_1, List<IZ> list2) {
        this.id_private = list;
        this.id_finally = bl;
        this.id_implements = wi_32;
        this.id_byte = map;
        this.id_throws = rqO_22;
        this.id_extends = ik_1;
        this.id_native = list2;
    }

    public String toString() {
        return this.id_break;
    }

    public static we_3 id_class(Reader reader) {
        return rpY_2.id_class(id_class, reader, we_3.class);
    }

    public IJ id_class(IC iC, we_3 we_32, Function<Ig_1, fj_3> function, Ix_1 ix_1, rqO_2 rqO_22, boolean bl) {
        fj_3 fj_32 = function.apply(this.id_byte("particle"));
        if (this.id_case() == IC.id_package) {
            return new IO(this.id_catch(), this.id_class(iC, we_32), fj_32, this.id_byte().id_class());
        }
        IY iY = new IY(this, this.id_class(iC, we_32), bl).id_class(fj_32);
        for (IS iS : this.id_class()) {
            for (rpr_3 rpr_32 : iS.id_byte.keySet()) {
                IG iG = iS.id_byte.get(rpr_32);
                fj_3 fj_33 = function.apply(this.id_byte(iG.id_byte));
                if (iG.id_class == null) {
                    iY.id_class(we_3.id_class(iS, iG, fj_33, rpr_32, ix_1, rqO_22));
                    continue;
                }
                iY.id_class(rpr_3.id_class(ix_1.id_class().id_byte(), iG.id_class), we_3.id_class(iS, iG, fj_33, rpr_32, ix_1, rqO_22));
            }
        }
        return iY.id_class();
    }

    private static wK_2 id_class(IS iS, IG iG, fj_3 fj_32, rpr_3 rpr_32, Ix_1 ix_1, rqO_2 rqO_22) {
        return id_catch.id_class(iS.id_class, iS.id_break, iG, fj_32, rpr_32, ix_1, iS.id_protected, iS.id_throws, rqO_22);
    }

    private IL id_class(IQ iQ) {
        return this.id_protected != null && !this.id_extends.id_break(iQ) ? this.id_protected.id_class(iQ) : this.id_extends.id_class(iQ);
    }

    private /* synthetic */ void id_class(Function function, Set set, Set set2, IZ iZ) {
        Id_1 id_1 = (Id_1)function.apply(iZ.id_class());
        if (!Objects.equals(id_1, this)) {
            set.addAll(id_1.id_class(function, set2));
        }
    }

    private /* synthetic */ void id_class(Set set, String string) {
        set.add(this.id_byte(string));
    }

    public List<IS> id_class() {
        return this.id_private.isEmpty() && this.id_protected != null ? this.id_protected.id_class() : this.id_private;
    }

    private IF id_class(IC iC, we_3 we_32) {
        return this.id_native.isEmpty() ? IF.id_class : new IF(iC, we_32, iC::id_class, this.id_native);
    }

    public static we_3 id_class(String string) {
        return we_3.id_class(new StringReader(string));
    }

    @Override
    public Collection<Ig_1> id_class(Function<rqO_2, Id_1> function, Set<Pair<String, String>> set) {
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        Object object = this;
        while (((we_3)object).id_throws != null && ((we_3)object).id_protected == null) {
            linkedHashSet.add(object);
            Object object2 = function.apply(((we_3)object).id_throws);
            if (object2 == null) {
                id_case.warn("No parent '{}' while loading model '{}'", (Object)this.id_throws, object);
            }
            if (linkedHashSet.contains(object2)) {
                id_case.warn("Found 'parent' loop while loading model '{}' in chain: {} -> {}", object, (Object)linkedHashSet.stream().map(Object::toString).collect(Collectors.joining(" -> ")), (Object)this.id_throws);
                object2 = null;
            }
            if (object2 == null) {
                ((we_3)object).id_throws = IC.id_native;
                object2 = function.apply(((we_3)object).id_throws);
            }
            if (!(object2 instanceof we_3)) {
                throw new IllegalStateException("BlockModel parent has to be a block model.");
            }
            ((we_3)object).id_protected = (we_3)object2;
            object = ((we_3)object).id_protected;
        }
        object = Sets.newHashSet((Object[])new Ig_1[]{this.id_byte("particle")});
        for (IS iS : this.id_class()) {
            for (IG iG : iS.id_byte.values()) {
                Ig_1 ig_1 = this.id_byte(iG.id_byte);
                if (Objects.equals(ig_1.id_break(), fQ_2.id_class())) {
                    set.add((Pair<String, String>)Pair.of((Object)iG.id_byte, (Object)this.id_break));
                }
                object.add(ig_1);
            }
        }
        this.id_native.forEach(arg_0 -> this.id_class(function, (Set)object, set, arg_0));
        if (this.id_case() == IC.id_final) {
            IN.id_class.forEach(arg_0 -> this.id_class((Set)object, arg_0));
        }
        return object;
    }

    @Override
    public IJ id_class(IC iC, Function<Ig_1, fj_3> function, Ix_1 ix_1, rqO_2 rqO_22) {
        return this.id_class(iC, this, function, ix_1, rqO_22, true);
    }

    public boolean id_break(String string) {
        return !fQ_2.id_class().equals(this.id_byte(string).id_break());
    }

    public boolean id_break() {
        return this.id_protected != null ? this.id_protected.id_break() : this.id_finally;
    }

    @Override
    public Collection<rqO_2> id_throws() {
        HashSet hashSet = Sets.newHashSet();
        for (IZ iZ : this.id_native) {
            hashSet.add(iZ.id_class());
        }
        if (this.id_throws != null) {
            hashSet.add(this.id_throws);
        }
        return hashSet;
    }

    public static boolean id_throws(String string) {
        return string.charAt(0) == '#';
    }

    public Ik_1 id_catch() {
        IL iL = this.id_class(IQ.THIRD_PERSON_LEFT_HAND);
        IL iL2 = this.id_class(IQ.THIRD_PERSON_RIGHT_HAND);
        IL iL3 = this.id_class(IQ.FIRST_PERSON_LEFT_HAND);
        IL iL4 = this.id_class(IQ.FIRST_PERSON_RIGHT_HAND);
        IL iL5 = this.id_class(IQ.HEAD);
        IL iL6 = this.id_class(IQ.GUI);
        IL iL7 = this.id_class(IQ.GROUND);
        IL iL8 = this.id_class(IQ.FIXED);
        return new Ik_1(iL, iL2, iL3, iL4, iL5, iL6, iL7, iL8);
    }

    public we_3 id_case() {
        return this.id_protected == null ? this : this.id_protected.id_case();
    }

    private Either<Ig_1, String> id_protected(String string) {
        we_3 we_32 = this;
        while (we_32 != null) {
            Either<Ig_1, String> either = we_32.id_byte.get(string);
            if (either != null) {
                return either;
            }
            we_32 = we_32.id_protected;
        }
        return Either.left((Object)new Ig_1(fJ_2.id_class, fQ_2.id_class()));
    }

    public List<IZ> id_protected() {
        return this.id_native;
    }
}

