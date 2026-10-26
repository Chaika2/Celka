/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.MT;
import celestial.VH;
import celestial.VI;
import celestial.Vf_1;
import celestial.Vp_1;
import celestial.Vt_1;
import celestial.Vw_1;
import celestial.gP_2;
import celestial.gr_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VT
implements AutoCloseable,
VH {
    private static final Logger id_class = LogManager.getLogger();
    private static final Vp_1 id_break = new Vp_1();
    private static VT id_byte;
    private static int id_protected;
    private final Map<String, IntSupplier> id_throws = Maps.newHashMap();
    private final List<String> id_case = Lists.newArrayList();
    private final List<Integer> id_catch = Lists.newArrayList();
    private final List<Vf_1> id_private = Lists.newArrayList();
    private final List<Integer> id_implements = Lists.newArrayList();
    private final Map<String, Vf_1> id_finally = Maps.newHashMap();
    private final int id_extends;
    private final String id_native;
    private boolean id_volatile;
    private final gr_3 id_final;
    private final List<Integer> id_package;
    private final List<String> id_int;
    private final Vw_1 id_new;
    private final Vw_1 id_continue;

    @Override
    public Vw_1 id_byte() {
        return this.id_new;
    }

    public VT(rAL rAL2, String string) throws IOException {
        rqO_2 rqO_22 = new rqO_2("shaders/program/" + string + ".json");
        this.id_native = string;
        rAF rAF2 = null;
        try {
            JsonArray jsonArray;
            JsonArray jsonArray2;
            rAF2 = rAL2.id_class(rqO_22);
            JsonObject jsonObject = rpY_2.id_class(new InputStreamReader(rAF2.id_break(), StandardCharsets.UTF_8));
            String string2 = rpY_2.id_case(jsonObject, "vertex");
            String string3 = rpY_2.id_case(jsonObject, "fragment");
            JsonArray jsonArray3 = rpY_2.id_class(jsonObject, "samplers", (JsonArray)null);
            if (jsonArray3 != null) {
                int n = 0;
                for (Object object : jsonArray3) {
                    try {
                        this.id_class((JsonElement)object);
                    }
                    catch (Exception exception) {
                        gP_2 gP_22 = gP_2.id_class(exception);
                        gP_22.id_class("samplers[" + n + "]");
                        throw gP_22;
                    }
                    ++n;
                }
            }
            if ((jsonArray2 = rpY_2.id_class(jsonObject, "attributes", (JsonArray)null)) != null) {
                int n = 0;
                this.id_package = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                this.id_int = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                for (JsonElement object : jsonArray2) {
                    try {
                        this.id_int.add(rpY_2.id_class(object, "attribute"));
                    }
                    catch (Exception exception) {
                        gP_2 gP_23 = gP_2.id_class(exception);
                        gP_23.id_class("attributes[" + n + "]");
                        throw gP_23;
                    }
                    ++n;
                }
            } else {
                this.id_package = null;
                this.id_int = null;
            }
            if ((jsonArray = rpY_2.id_class(jsonObject, "uniforms", (JsonArray)null)) != null) {
                int n = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.id_break(jsonElement);
                    }
                    catch (Exception exception) {
                        gP_2 gP_24 = gP_2.id_class(exception);
                        gP_24.id_class("uniforms[" + n + "]");
                        throw gP_24;
                    }
                    ++n;
                }
            }
            this.id_final = VT.id_class(rpY_2.id_class(jsonObject, "blend", (JsonObject)null));
            this.id_new = VT.id_class(rAL2, VI.VERTEX, string2);
            this.id_continue = VT.id_class(rAL2, VI.FRAGMENT, string3);
            this.id_extends = Vt_1.id_class();
            Vt_1.id_break(this);
            this.id_catch();
            if (this.id_int != null) {
                for (String string4 : this.id_int) {
                    int n = Vf_1.id_break(this.id_extends, string4);
                    this.id_package.add(n);
                }
            }
        }
        catch (Exception exception) {
            Object object = rAF2 != null ? " (" + rAF2.id_byte() + ")" : "";
            gP_2 gP_25 = gP_2.id_class(exception);
            gP_25.id_break(rqO_22.id_break() + (String)object);
            throw gP_25;
        }
        finally {
            IOUtils.closeQuietly((Closeable)rAF2);
        }
        this.id_break();
    }

    static {
        id_protected = -1;
    }

    public static gr_3 id_class(JsonObject jsonObject) {
        if (jsonObject == null) {
            return new gr_3();
        }
        int n = 32774;
        int n2 = 1;
        int n3 = 0;
        int n4 = 1;
        int n5 = 0;
        boolean bl = true;
        boolean bl2 = false;
        if (rpY_2.id_class(jsonObject, "func") && (n = gr_3.id_class(jsonObject.get("func").getAsString())) != 32774) {
            bl = false;
        }
        if (rpY_2.id_class(jsonObject, "srcrgb") && (n2 = gr_3.id_break(jsonObject.get("srcrgb").getAsString())) != 1) {
            bl = false;
        }
        if (rpY_2.id_class(jsonObject, "dstrgb") && (n3 = gr_3.id_break(jsonObject.get("dstrgb").getAsString())) != 0) {
            bl = false;
        }
        if (rpY_2.id_class(jsonObject, "srcalpha")) {
            n4 = gr_3.id_break(jsonObject.get("srcalpha").getAsString());
            if (n4 != 1) {
                bl = false;
            }
            bl2 = true;
        }
        if (rpY_2.id_class(jsonObject, "dstalpha")) {
            n5 = gr_3.id_break(jsonObject.get("dstalpha").getAsString());
            if (n5 != 0) {
                bl = false;
            }
            bl2 = true;
        }
        if (bl) {
            return new gr_3();
        }
        return bl2 ? new gr_3(n2, n3, n4, n5, n) : new gr_3(n2, n3, n);
    }

    public Vf_1 id_class(String string) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        return this.id_finally.get(string);
    }

    public void id_class(String string, IntSupplier intSupplier) {
        if (this.id_throws.containsKey(string)) {
            this.id_throws.remove(string);
        }
        this.id_throws.put(string, intSupplier);
        this.id_break();
    }

    private void id_class(JsonElement jsonElement) {
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "sampler");
        String string = rpY_2.id_case(jsonObject, "name");
        if (!rpY_2.id_class(jsonObject, "file")) {
            this.id_throws.put(string, null);
            this.id_case.add(string);
        } else {
            this.id_case.add(string);
        }
    }

    @Override
    public int id_class() {
        return this.id_extends;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Vw_1 id_class(rAL rAL2, VI vI, String string) throws IOException {
        Vw_1 vw_1 = vI.id_byte().get(string);
        if (vw_1 == null) {
            rqO_2 rqO_22 = new rqO_2("shaders/program/" + string + vI.id_break());
            rAF rAF2 = rAL2.id_class(rqO_22);
            try {
                vw_1 = Vw_1.id_class(vI, string, rAF2.id_break(), rAF2.id_byte());
            }
            finally {
                IOUtils.closeQuietly((Closeable)rAF2);
            }
        }
        return vw_1;
    }

    @Override
    public void close() {
        for (Vf_1 vf_1 : this.id_private) {
            vf_1.close();
        }
        Vt_1.id_class(this);
    }

    private void id_break(JsonElement jsonElement) throws gP_2 {
        Object object2;
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "uniform");
        String string = rpY_2.id_case(jsonObject, "name");
        int n = Vf_1.id_class(rpY_2.id_case(jsonObject, "type"));
        int n2 = rpY_2.id_extends(jsonObject, "count");
        float[] fArray = new float[Math.max(n2, 16)];
        JsonArray jsonArray = rpY_2.id_volatile(jsonObject, "values");
        if (jsonArray.size() != n2 && jsonArray.size() > 1) {
            throw new gP_2("Invalid amount of values specified (expected " + n2 + ", found " + jsonArray.size() + ")");
        }
        int n3 = 0;
        for (Object object2 : jsonArray) {
            try {
                fArray[n3] = rpY_2.id_protected((JsonElement)object2, "value");
            }
            catch (Exception exception) {
                gP_2 gP_22 = gP_2.id_class(exception);
                gP_22.id_class("values[" + n3 + "]");
                throw gP_22;
            }
            ++n3;
        }
        if (n2 > 1 && jsonArray.size() == 1) {
            while (n3 < n2) {
                fArray[n3] = fArray[0];
                ++n3;
            }
        }
        int n4 = n2 > 1 && n2 <= 4 && n < 8 ? n2 - 1 : 0;
        object2 = new Vf_1(string, n + n4, n2, this);
        if (n <= 3) {
            ((Vf_1)object2).id_class((int)fArray[0], (int)fArray[1], (int)fArray[2], (int)fArray[3]);
        } else if (n <= 7) {
            ((Vf_1)object2).id_break(fArray[0], fArray[1], fArray[2], fArray[3]);
        } else {
            ((Vf_1)object2).id_class(fArray);
        }
        this.id_private.add((Vf_1)object2);
    }

    @Override
    public void id_break() {
        this.id_volatile = true;
    }

    public Vp_1 id_break(String string) {
        RenderSystem.assertThread(RenderSystem::isOnGameThread);
        Vf_1 vf_1 = this.id_class(string);
        return vf_1 == null ? id_break : vf_1;
    }

    public void id_throws() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        Vt_1.id_class(0);
        id_protected = -1;
        id_byte = null;
        for (int i = 0; i < this.id_catch.size(); ++i) {
            if (this.id_throws.get(this.id_case.get(i)) == null) continue;
            MT.id_new(33984 + i);
            MT.id_short();
            MT.id_super(0);
        }
    }

    private void id_catch() {
        int n;
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        IntArrayList intArrayList = new IntArrayList();
        for (n = 0; n < this.id_case.size(); ++n) {
            String object = this.id_case.get(n);
            int n2 = Vf_1.id_class(this.id_extends, object);
            if (n2 == -1) {
                id_class.warn("Shader {} could not find sampler named {} in the specified shader program.", (Object)this.id_native, (Object)object);
                this.id_throws.remove(object);
                intArrayList.add(n);
                continue;
            }
            this.id_catch.add(n2);
        }
        for (n = intArrayList.size() - 1; n >= 0; --n) {
            this.id_case.remove(intArrayList.getInt(n));
        }
        for (Vf_1 vf_1 : this.id_private) {
            String string = vf_1.id_class();
            int n3 = Vf_1.id_class(this.id_extends, string);
            if (n3 == -1) {
                id_class.warn("Could not find uniform named {} in the specified shader program.", (Object)string);
                continue;
            }
            this.id_implements.add(n3);
            vf_1.id_class(n3);
            this.id_finally.put(string, vf_1);
        }
    }

    public void id_case() {
        RenderSystem.assertThread(RenderSystem::isOnGameThread);
        this.id_volatile = false;
        id_byte = this;
        this.id_final.id_class();
        if (this.id_extends != id_protected) {
            Vt_1.id_class(this.id_extends);
            id_protected = this.id_extends;
        }
        for (int i = 0; i < this.id_catch.size(); ++i) {
            String object = this.id_case.get(i);
            IntSupplier intSupplier = this.id_throws.get(object);
            if (intSupplier == null) continue;
            RenderSystem.activeTexture(33984 + i);
            RenderSystem.enableTexture();
            int n = intSupplier.getAsInt();
            if (n == -1) continue;
            RenderSystem.bindTexture(n);
            Vf_1.id_class((int)this.id_catch.get(i), i);
        }
        for (Vf_1 vf_1 : this.id_private) {
            vf_1.id_break();
        }
    }

    @Override
    public Vw_1 id_protected() {
        return this.id_continue;
    }
}

