/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.QY;
import celestial.VC;
import celestial.Vf_1;
import celestial.Vy_1;
import celestial.fY_2;
import celestial.ff_3;
import celestial.gP_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rjV_2;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class Vq_1
implements AutoCloseable {
    private final VC id_class;
    private final rAL id_break;
    private final String id_byte;
    private final List<Vy_1> id_protected = Lists.newArrayList();
    private final Map<String, VC> id_throws = Maps.newHashMap();
    private final List<VC> id_case = Lists.newArrayList();
    private rjV_2 id_catch;
    private int id_private;
    private int id_implements;
    private float id_finally;
    private float id_extends;

    public Vq_1(fY_2 fY_22, rAL rAL2, VC vC, rqO_2 rqO_22) throws IOException, JsonSyntaxException {
        this.id_break = rAL2;
        this.id_class = vC;
        this.id_finally = 0.0f;
        this.id_extends = 0.0f;
        this.id_private = vC.id_byte;
        this.id_implements = vC.id_protected;
        this.id_byte = rqO_22.toString();
        this.id_break();
        this.id_class(fY_22, rqO_22);
    }

    public void id_class(float f) {
        if (f < this.id_extends) {
            this.id_finally += 1.0f - this.id_extends;
            this.id_finally += f;
        } else {
            this.id_finally += f - this.id_extends;
        }
        this.id_extends = f;
        while (this.id_finally > 20.0f) {
            this.id_finally -= 20.0f;
        }
        for (Vy_1 vy_1 : this.id_protected) {
            vy_1.id_class(this.id_finally / 20.0f);
        }
    }

    public void id_class(String string, int n, int n2) {
        VC vC = new VC(n, n2, true, (Boolean)QY.id_break[2]);
        vC.id_class(0.0f, 0.0f, 0.0f, 0.0f);
        this.id_throws.put(string, vC);
        if (n == this.id_private && n2 == this.id_implements) {
            this.id_case.add(vC);
        }
    }

    public VC id_class(String string) {
        return this.id_throws.get(string);
    }

    public Vy_1 id_class(String string, VC vC, VC vC2) throws IOException {
        Vy_1 vy_1 = new Vy_1(this.id_break, string, vC, vC2);
        this.id_protected.add(this.id_protected.size(), vy_1);
        return vy_1;
    }

    public void id_class(int n, int n2) {
        this.id_private = this.id_class.id_class;
        this.id_implements = this.id_class.id_break;
        this.id_break();
        for (Vy_1 object : this.id_protected) {
            object.id_class(this.id_catch);
        }
        for (VC vC : this.id_case) {
            vC.id_class(n, n2, (Boolean)QY.id_break[2]);
        }
    }

    private void id_class(fY_2 fY_22, rqO_2 rqO_22) throws IOException, JsonSyntaxException {
        rAF rAF2;
        block11: {
            rAF2 = null;
            try {
                int n;
                JsonArray jsonArray;
                rAF2 = this.id_break.id_class(rqO_22);
                JsonObject jsonObject = rpY_2.id_class(new InputStreamReader(rAF2.id_break(), StandardCharsets.UTF_8));
                if (rpY_2.id_byte(jsonObject, "targets")) {
                    jsonArray = jsonObject.getAsJsonArray("targets");
                    n = 0;
                    for (JsonElement jsonElement : jsonArray) {
                        try {
                            this.id_class(jsonElement);
                        }
                        catch (Exception exception) {
                            gP_2 gP_22 = gP_2.id_class(exception);
                            gP_22.id_class("targets[" + n + "]");
                            throw gP_22;
                        }
                        ++n;
                    }
                }
                if (!rpY_2.id_byte(jsonObject, "passes")) break block11;
                jsonArray = jsonObject.getAsJsonArray("passes");
                n = 0;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.id_class(fY_22, jsonElement);
                    }
                    catch (Exception exception) {
                        gP_2 gP_23 = gP_2.id_class(exception);
                        gP_23.id_class("passes[" + n + "]");
                        throw gP_23;
                    }
                    ++n;
                }
            }
            catch (Exception exception) {
                try {
                    Object object = rAF2 != null ? " (" + rAF2.id_byte() + ")" : "";
                    gP_2 gP_24 = gP_2.id_class(exception);
                    gP_24.id_break(rqO_22.id_break() + (String)object);
                    throw gP_24;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(rAF2);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((Closeable)rAF2);
    }

    private void id_class(JsonElement jsonElement) throws gP_2 {
        if (rpY_2.id_class(jsonElement)) {
            this.id_class(jsonElement.getAsString(), this.id_private, this.id_implements);
        } else {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "target");
            String string = rpY_2.id_case(jsonObject, "name");
            int n = rpY_2.id_class(jsonObject, "width", this.id_private);
            int n2 = rpY_2.id_class(jsonObject, "height", this.id_implements);
            if (this.id_throws.containsKey(string)) {
                throw new gP_2(string + " is already defined");
            }
            this.id_class(string, n, n2);
        }
    }

    private void id_class(fY_2 fY_22, JsonElement jsonElement) throws IOException {
        JsonArray jsonArray;
        Object object;
        JsonObject jsonObject;
        block21: {
            jsonObject = rpY_2.id_private(jsonElement, "pass");
            String string = rpY_2.id_case(jsonObject, "name");
            String string2 = rpY_2.id_case(jsonObject, "intarget");
            String string3 = rpY_2.id_case(jsonObject, "outtarget");
            VC vC = this.id_break(string2);
            VC vC2 = this.id_break(string3);
            if (vC == null) {
                throw new gP_2("Input target '" + string2 + "' does not exist");
            }
            if (vC2 == null) {
                throw new gP_2("Output target '" + string3 + "' does not exist");
            }
            Vy_1 vy_1 = this.id_class(string, vC, vC2);
            JsonArray jsonArray2 = rpY_2.id_class(jsonObject, "auxtargets", (JsonArray)null);
            if (jsonArray2 == null) break block21;
            int n = 0;
            for (Object object2 : jsonArray2) {
                block20: {
                    Object object3;
                    try {
                        VC vC3;
                        boolean bl;
                        block22: {
                            Object object4;
                            JsonObject jsonObject2 = rpY_2.id_private((JsonElement)object2, "auxtarget");
                            object3 = rpY_2.id_case(jsonObject2, "name");
                            object = rpY_2.id_case(jsonObject2, "id");
                            if (((String)object).endsWith(":depth")) {
                                bl = true;
                                object4 = ((String)object).substring(0, ((String)object).lastIndexOf(58));
                            } else {
                                bl = false;
                                object4 = object;
                            }
                            vC3 = this.id_break((String)object4);
                            if (vC3 != null) break block22;
                            if (bl) {
                                throw new gP_2("Render target '" + (String)object4 + "' can't be used as depth buffer");
                            }
                            rqO_2 rqO_22 = new rqO_2("textures/effect/" + (String)object4 + ".png");
                            rAF rAF2 = null;
                            try {
                                rAF2 = this.id_break.id_class(rqO_22);
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                try {
                                    throw new gP_2("Render target or texture '" + (String)object4 + "' does not exist");
                                }
                                catch (Throwable throwable) {
                                    IOUtils.closeQuietly(rAF2);
                                    throw throwable;
                                }
                            }
                            IOUtils.closeQuietly((Closeable)rAF2);
                            fY_22.id_class(rqO_22);
                            ff_3 ff_32 = fY_22.id_break(rqO_22);
                            int n2 = rpY_2.id_extends(jsonObject2, "width");
                            int n3 = rpY_2.id_extends(jsonObject2, "height");
                            boolean bl2 = rpY_2.id_private(jsonObject2, "bilinear");
                            if (bl2) {
                                RenderSystem.texParameter(3553, 10241, 9729);
                                RenderSystem.texParameter(3553, 10240, 9729);
                            } else {
                                RenderSystem.texParameter(3553, 10241, 9728);
                                RenderSystem.texParameter(3553, 10240, 9728);
                            }
                            vy_1.id_class((String)object3, ff_32::id_new, n2, n3);
                            break block20;
                        }
                        if (bl) {
                            vy_1.id_class((String)object3, vC3::id_catch, vC3.id_class, vC3.id_break);
                        } else {
                            vy_1.id_class((String)object3, vC3::id_case, vC3.id_class, vC3.id_break);
                        }
                    }
                    catch (Exception exception) {
                        object3 = gP_2.id_class(exception);
                        ((gP_2)object3).id_class("auxtargets[" + n + "]");
                        throw object3;
                    }
                }
                ++n;
            }
        }
        if ((jsonArray = rpY_2.id_class(jsonObject, "uniforms", (JsonArray)null)) != null) {
            int n = 0;
            for (JsonObject jsonObject2 : jsonArray) {
                try {
                    this.id_break((JsonElement)jsonObject2);
                }
                catch (Exception exception) {
                    object = gP_2.id_class(exception);
                    ((gP_2)object).id_class("uniforms[" + n + "]");
                    throw object;
                }
                ++n;
            }
        }
    }

    public final String id_class() {
        return this.id_byte;
    }

    @Override
    public void close() {
        for (VC object : this.id_throws.values()) {
            object.id_class();
        }
        for (Vy_1 vy_1 : this.id_protected) {
            vy_1.close();
        }
        this.id_protected.clear();
    }

    private VC id_break(String string) {
        if (string == null) {
            return null;
        }
        return string.equals("minecraft:main") ? this.id_class : this.id_throws.get(string);
    }

    private void id_break(JsonElement jsonElement) throws gP_2 {
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "uniform");
        String string = rpY_2.id_case(jsonObject, "name");
        Vf_1 vf_1 = this.id_protected.get(this.id_protected.size() - 1).id_class().id_class(string);
        if (vf_1 == null) {
            throw new gP_2("Uniform '" + string + "' does not exist");
        }
        float[] fArray = new float[4];
        int n = 0;
        for (JsonElement jsonElement2 : rpY_2.id_volatile(jsonObject, "values")) {
            try {
                fArray[n] = rpY_2.id_protected(jsonElement2, "value");
            }
            catch (Exception exception) {
                gP_2 gP_22 = gP_2.id_class(exception);
                gP_22.id_class("values[" + n + "]");
                throw gP_22;
            }
            ++n;
        }
        switch (n) {
            default: {
                break;
            }
            case 1: {
                vf_1.id_class(fArray[0]);
                break;
            }
            case 2: {
                vf_1.id_class(fArray[0], fArray[1]);
                break;
            }
            case 3: {
                vf_1.id_class(fArray[0], fArray[1], fArray[2]);
                break;
            }
            case 4: {
                vf_1.id_class(fArray[0], fArray[1], fArray[2], fArray[3]);
            }
        }
    }

    private void id_break() {
        this.id_catch = rjV_2.id_class(this.id_class.id_class, (float)this.id_class.id_break, 0.1f, 1000.0f);
    }
}

