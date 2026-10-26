/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.ints.Int2IntArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package celestial;

import celestial.jL_2;
import celestial.jv_3;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.stream.Collectors;

public class jZ_2 {
    private ImmutableList<jv_3> id_class;
    private IntList id_break = new IntArrayList();
    private int id_byte;
    private String id_protected;
    private int id_throws = -1;
    private int id_case = -1;
    private int id_catch = -1;
    private Int2IntMap id_private = new Int2IntArrayMap();

    public int id_byte(int n) {
        return this.id_private.get(n);
    }

    public ImmutableList<jv_3> id_byte() {
        return this.id_class;
    }

    public jZ_2(ImmutableList<jv_3> immutableList) {
        this.id_class = immutableList;
        int n = 0;
        for (jv_3 jv_32 : immutableList) {
            this.id_break.add(n);
            jL_2 jL_22 = jv_32.id_break();
            if (jL_22 == jL_2.POSITION) {
                this.id_throws = n;
            } else if (jL_22 == jL_2.NORMAL) {
                this.id_case = n;
            } else if (jL_22 == jL_2.COLOR) {
                this.id_catch = n;
            } else if (jL_22 == jL_2.UV) {
                this.id_private.put(jv_32.id_byte(), n);
            }
            n += jv_32.id_protected();
        }
        this.id_byte = n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            jZ_2 jZ_22 = (jZ_2)object;
            return this.id_byte != jZ_22.id_byte ? false : this.id_class.equals(jZ_22.id_class);
        }
        return false;
    }

    public String toString() {
        return "format: " + this.id_protected + " " + this.id_class.size() + " elements: " + this.id_class.stream().map(Object::toString).collect(Collectors.joining(" "));
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    public int id_class() {
        return this.id_break() >> 2;
    }

    public int id_class(int n) {
        return this.id_break.getInt(n);
    }

    public void id_class(String string) {
        this.id_protected = string;
    }

    public void id_class(long l) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.id_class(l));
        } else {
            int n = this.id_break();
            ImmutableList<jv_3> immutableList = this.id_byte();
            for (int i = 0; i < immutableList.size(); ++i) {
                ((jv_3)immutableList.get(i)).id_class(l + (long)this.id_break.getInt(i), n);
            }
        }
    }

    public void id_class(jZ_2 jZ_22) {
        this.id_class = jZ_22.id_class;
        this.id_break = jZ_22.id_break;
        this.id_byte = jZ_22.id_byte;
        this.id_protected = jZ_22.id_protected;
        this.id_throws = jZ_22.id_throws;
        this.id_case = jZ_22.id_case;
        this.id_catch = jZ_22.id_catch;
        this.id_private = jZ_22.id_private;
    }

    public boolean id_break(int n) {
        return this.id_private.containsKey(n);
    }

    public int id_break() {
        return this.id_byte;
    }

    public boolean id_throws() {
        return this.id_throws >= 0;
    }

    public int id_finally() {
        return this.id_catch;
    }

    public boolean id_catch() {
        return this.id_case >= 0;
    }

    public String id_extends() {
        return this.id_protected;
    }

    public int id_case() {
        return this.id_throws;
    }

    public boolean id_implements() {
        return this.id_catch >= 0;
    }

    public void id_protected() {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(this::id_protected);
        } else {
            for (jv_3 jv_32 : this.id_byte()) {
                jv_32.id_throws();
            }
        }
    }

    public int id_private() {
        return this.id_case;
    }

    public jZ_2 id_native() {
        jZ_2 jZ_22 = new jZ_2((ImmutableList<jv_3>)ImmutableList.of());
        jZ_22.id_class(this);
        return jZ_22;
    }
}

