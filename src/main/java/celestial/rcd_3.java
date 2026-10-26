/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.rVi_1;
import celestial.rcD_2;
import celestial.rcK_2;
import celestial.rcL_2;
import celestial.rcM_2;
import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcf_3;
import celestial.rcg_3;
import celestial.rch_3;
import celestial.rck_3;
import celestial.rcn_3;
import celestial.rco_3;
import celestial.rcq_3;
import celestial.rct_3;
import celestial.rcu_3;
import celestial.rcv_3;
import celestial.rcy_3;
import celestial.rcz_3;
import celestial.rgN_2;
import celestial.rgP_2;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rcd_3
implements rcZ_2 {
    public static final Codec<rcd_3> id_class = Codec.PASSTHROUGH.comapFlatMap(dynamic -> {
        rcZ_2 rcZ_22 = (rcZ_2)dynamic.convert((DynamicOps)rcf_3.id_class).getValue();
        return rcZ_22 instanceof rcd_3 ? DataResult.success((Object)((rcd_3)rcZ_22)) : DataResult.error((String)("Not a compound tag: " + rcZ_22));
    }, rcd_32 -> new Dynamic((DynamicOps)rcf_3.id_class, rcd_32));
    private static final Logger id_byte = LogManager.getLogger();
    private static final Pattern id_private = Pattern.compile("[A-Za-z0-9._+-]+");
    public static final rcv_3<rcd_3> id_break = new rck_3();
    private final Map<String, rcZ_2> id_implements;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_catch();
    }

    public boolean id_byte(String string, int n) {
        byte by = this.id_protected(string);
        if (by == n) {
            return true;
        }
        if (n != 99) {
            return false;
        }
        return by == 1 || by == 2 || by == 3 || by == 4 || by == 5 || by == 6;
    }

    public rcZ_2 id_byte(String string) {
        return this.id_implements.get(string);
    }

    public rcd_3 id_int(String string) {
        try {
            if (this.id_byte(string, 10)) {
                return (rcd_3)this.id_implements.get(string);
            }
        }
        catch (ClassCastException classCastException) {
            throw new KU(this.id_class(string, id_break, classCastException));
        }
        return new rcd_3();
    }

    public rcd_3() {
        this(Maps.newHashMap());
    }

    protected rcd_3(Map<String, rcZ_2> map) {
        this.id_implements = map;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rcd_3 && Objects.equals(this.id_implements, ((rcd_3)object).id_implements);
    }

    @Override
    public String toString() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder("{");
        Object object2 = this.id_implements.keySet();
        if (id_byte.isDebugEnabled()) {
            object = Lists.newArrayList(this.id_implements.keySet());
            Collections.sort(object);
            object2 = object;
        }
        object = object2.iterator();
        while (object.hasNext()) {
            String string = (String)object.next();
            if (stringBuilder.length() != 1) {
                stringBuilder.append(',');
            }
            stringBuilder.append(rcd_3.id_super(string)).append(':').append(this.id_implements.get(string));
        }
        return stringBuilder.append('}').toString();
    }

    public int hashCode() {
        return this.id_implements.hashCode();
    }

    protected static rgP_2 id_this(String string) {
        if (id_private.matcher(string).matches()) {
            return new rgN_2(string).id_class(id_protected);
        }
        String string2 = rca_3.id_break(string);
        String string3 = string2.substring(0, 1);
        rVi_1 rVi_12 = new rgN_2(string2.substring(1, string2.length() - 1)).id_class(id_protected);
        return new rgN_2(string3).id_class(rVi_12).id_break(string3);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        for (String string : this.id_implements.keySet()) {
            rcZ_2 rcZ_22 = this.id_implements.get(string);
            rcd_3.id_class(string, rcZ_22, dataOutput);
        }
        dataOutput.writeByte(0);
    }

    @Override
    public byte id_class() {
        return 10;
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        Object object;
        if (this.id_implements.isEmpty()) {
            return new rgN_2("{}");
        }
        rgN_2 rgN_22 = new rgN_2("{");
        Collection<String> collection = this.id_implements.keySet();
        if (id_byte.isDebugEnabled()) {
            object = Lists.newArrayList(this.id_implements.keySet());
            Collections.sort(object);
            collection = object;
        }
        if (!string.isEmpty()) {
            rgN_22.id_break("\n");
        }
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            object = new rgN_2(Strings.repeat((String)string, (int)(n + 1))).id_class(rcd_3.id_this(string2)).id_break(String.valueOf(':')).id_break(" ").id_class(this.id_implements.get(string2).id_class(string, n + 1));
            if (iterator.hasNext()) {
                object.id_break(String.valueOf(',')).id_break(string.isEmpty() ? " " : "\n");
            }
            rgN_22.id_class((rgP_2)object);
        }
        if (!string.isEmpty()) {
            rgN_22.id_break("\n").id_break(Strings.repeat((String)string, (int)n));
        }
        rgN_22.id_break("}");
        return rgN_22;
    }

    public void id_class(String string, boolean bl) {
        this.id_implements.put(string, rch_3.id_class(bl));
    }

    public static byte id_class(DataInput dataInput, rcg_3 rcg_32) throws IOException {
        return dataInput.readByte();
    }

    private static void id_class(String string, rcZ_2 rcZ_22, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(rcZ_22.id_class());
        if (rcZ_22.id_class() != 0) {
            dataOutput.writeUTF(string);
            rcZ_22.id_class(dataOutput);
        }
    }

    public boolean id_class(Object object, Set<String> set) {
        if (this == object) {
            return true;
        }
        if (object instanceof rcd_3) {
            rcd_3 rcd_32 = (rcd_3)object;
            for (String string : this.id_implements.keySet()) {
                if (set.contains(string) || this.id_implements.get(string).equals(rcd_32.id_implements.get(string))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private KY id_class(String string, rcv_3<?> rcv_32, ClassCastException classCastException) {
        KY kY = KY.id_class(classCastException, "Reading NBT data");
        Ko_1 ko_1 = kY.id_class("Corrupt NBT tag", 1);
        ko_1.id_class("Tag type found", () -> this.id_implements.get(string).id_break().id_class());
        ko_1.id_class("Tag type expected", rcv_32::id_class);
        ko_1.id_class("Tag name", string);
        return kY;
    }

    public static rcZ_2 id_class(rcv_3<?> rcv_32, String string, DataInput dataInput, int n, rcg_3 rcg_32) {
        try {
            return rcv_32.id_break(dataInput, n, rcg_32);
        }
        catch (IOException iOException) {
            KY kY = KY.id_class(iOException, "Loading NBT data");
            Ko_1 ko_1 = kY.id_class("NBT Tag");
            ko_1.id_class("Tag name", string);
            ko_1.id_class("Tag type", rcv_32.id_class());
            throw new KU(kY);
        }
    }

    public rcd_3 id_class(rcd_3 rcd_32) {
        for (String string : rcd_32.id_implements.keySet()) {
            rcZ_2 rcZ_22 = rcd_32.id_implements.get(string);
            if (rcZ_22.id_class() == 10) {
                if (this.id_byte(string, 10)) {
                    rcd_3 rcd_33 = this.id_int(string);
                    rcd_33.id_class((rcd_3)rcZ_22);
                    continue;
                }
                this.id_class(string, rcZ_22.id_byte());
                continue;
            }
            this.id_class(string, rcZ_22.id_byte());
        }
        return this;
    }

    public void id_class(String string, UUID uUID) {
        this.id_implements.put(string, rco_3.id_class(uUID));
    }

    public void id_class(String string, byte[] byArray) {
        this.id_implements.put(string, new rcM_2(byArray));
    }

    public void id_class(String string, long l) {
        this.id_implements.put(string, rct_3.id_class(l));
    }

    public void id_class(String string, int[] nArray) {
        this.id_implements.put(string, new rcL_2(nArray));
    }

    public UUID id_class(String string) {
        return rco_3.id_class(this.id_byte(string));
    }

    public void id_class(String string, String string2) {
        this.id_implements.put(string, rca_3.id_class(string2));
    }

    public void id_class(String string, float f) {
        this.id_implements.put(string, rcu_3.id_class(f));
    }

    public void id_class(String string, long[] lArray) {
        this.id_implements.put(string, new rcq_3(lArray));
    }

    public rcZ_2 id_class(String string, rcZ_2 rcZ_22) {
        return this.id_implements.put(string, rcZ_22);
    }

    public void id_class(String string, List<Integer> list) {
        this.id_implements.put(string, new rcL_2(list));
    }

    public void id_class(String string, double d) {
        this.id_implements.put(string, rcz_3.id_class(d));
    }

    public void id_class(String string, short s) {
        this.id_implements.put(string, rcD_2.id_class(s));
    }

    public void id_class(String string, byte by) {
        this.id_implements.put(string, rch_3.id_class(by));
    }

    public boolean id_break(String string) {
        rcZ_2 rcZ_22 = this.id_byte(string);
        return rcZ_22 != null && rcZ_22.id_break() == rcL_2.id_class && ((rcL_2)rcZ_22).id_case().length == 4;
    }

    public void id_break(String string, int n) {
        this.id_implements.put(string, rcn_3.id_class(n));
    }

    public static String id_break(DataInput dataInput, rcg_3 rcg_32) throws IOException {
        return dataInput.readUTF();
    }

    public rcv_3<rcd_3> id_break() {
        return id_break;
    }

    public void id_break(String string, List<Long> list) {
        this.id_implements.put(string, new rcq_3(list));
    }

    public boolean id_throws(String string) {
        return this.id_implements.containsKey(string);
    }

    public int id_throws() {
        return this.id_implements.size();
    }

    public float id_finally(String string) {
        try {
            if (this.id_byte(string, 99)) {
                return ((rcK_2)this.id_implements.get(string)).id_finally();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0.0f;
    }

    public short id_catch(String string) {
        try {
            if (this.id_byte(string, 99)) {
                return ((rcK_2)this.id_implements.get(string)).id_catch();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public rcd_3 id_catch() {
        HashMap hashMap = Maps.newHashMap((Map)Maps.transformValues(this.id_implements, rcZ_2::id_byte));
        return new rcd_3(hashMap);
    }

    public double id_extends(String string) {
        try {
            if (this.id_byte(string, 99)) {
                return ((rcK_2)this.id_implements.get(string)).id_implements();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0.0;
    }

    public byte id_case(String string) {
        try {
            if (this.id_byte(string, 99)) {
                return ((rcK_2)this.id_implements.get(string)).id_private();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    public boolean id_case() {
        return this.id_implements.isEmpty();
    }

    public void id_continue(String string) {
        this.id_implements.remove(string);
    }

    public long id_implements(String string) {
        try {
            if (this.id_byte(string, 99)) {
                return ((rcK_2)this.id_implements.get(string)).id_throws();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0L;
    }

    public boolean id_new(String string) {
        return this.id_case(string) != 0;
    }

    public long[] id_package(String string) {
        try {
            if (this.id_byte(string, 12)) {
                return ((rcq_3)this.id_implements.get(string)).id_case();
            }
        }
        catch (ClassCastException classCastException) {
            throw new KU(this.id_class(string, rcq_3.id_class, classCastException));
        }
        return new long[0];
    }

    protected static String id_super(String string) {
        return id_private.matcher(string).matches() ? string : rca_3.id_break(string);
    }

    public byte id_protected(String string) {
        rcZ_2 rcZ_22 = this.id_implements.get(string);
        return rcZ_22 == null ? (byte)0 : rcZ_22.id_class();
    }

    public Set<String> id_protected() {
        return this.id_implements.keySet();
    }

    public rcy_3 id_protected(String string, int n) {
        try {
            if (this.id_protected(string) == 9) {
                rcy_3 rcy_32 = (rcy_3)this.id_implements.get(string);
                if (!rcy_32.isEmpty() && rcy_32.id_throws() != n) {
                    return new rcy_3();
                }
                return rcy_32;
            }
        }
        catch (ClassCastException classCastException) {
            throw new KU(this.id_class(string, rcy_3.id_class, classCastException));
        }
        return new rcy_3();
    }

    public int id_private(String string) {
        try {
            if (this.id_byte(string, 99)) {
                return ((rcK_2)this.id_implements.get(string)).id_case();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return 0;
    }

    protected Map<String, rcZ_2> id_private() {
        return Collections.unmodifiableMap(this.id_implements);
    }

    public int[] id_final(String string) {
        try {
            if (this.id_byte(string, 11)) {
                return ((rcL_2)this.id_implements.get(string)).id_case();
            }
        }
        catch (ClassCastException classCastException) {
            throw new KU(this.id_class(string, rcL_2.id_class, classCastException));
        }
        return new int[0];
    }

    public byte[] id_volatile(String string) {
        try {
            if (this.id_byte(string, 7)) {
                return ((rcM_2)this.id_implements.get(string)).id_protected();
            }
        }
        catch (ClassCastException classCastException) {
            throw new KU(this.id_class(string, rcM_2.id_class, classCastException));
        }
        return new byte[0];
    }

    public String id_native(String string) {
        try {
            if (this.id_byte(string, 8)) {
                return this.id_implements.get(string).id_native();
            }
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
        return "";
    }
}

