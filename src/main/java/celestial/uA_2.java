/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.stb.STBTTFontinfo
 *  org.lwjgl.stb.STBTruetype
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.fo_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.uF_2;
import celestial.uc_3;
import celestial.uu_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryUtil;

public class uA_2
implements uu_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final rqO_2 id_break;
    private final float id_byte;
    private final float id_protected;
    private final float id_throws;
    private final float id_case;
    private final String id_catch;

    public uA_2(rqO_2 rqO_22, float f, float f2, float f3, float f4, String string) {
        this.id_break = rqO_22;
        this.id_byte = f;
        this.id_protected = f2;
        this.id_throws = f3;
        this.id_case = f4;
        this.id_catch = string;
    }

    public static uu_3 id_class(JsonObject jsonObject) {
        Object object;
        float f = 0.0f;
        float f2 = 0.0f;
        if (jsonObject.has("shift")) {
            object = jsonObject.getAsJsonArray("shift");
            if (object.size() != 2) {
                throw new JsonParseException("Expected 2 elements in 'shift', found " + object.size());
            }
            f = rpY_2.id_protected(object.get(0), "shift[0]");
            f2 = rpY_2.id_protected(object.get(1), "shift[1]");
        }
        object = new StringBuilder();
        if (jsonObject.has("skip")) {
            JsonElement jsonElement = jsonObject.get("skip");
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = rpY_2.id_implements(jsonElement, "skip");
                for (int i = 0; i < jsonArray.size(); ++i) {
                    ((StringBuilder)object).append(rpY_2.id_class(jsonArray.get(i), "skip[" + i + "]"));
                }
            } else {
                ((StringBuilder)object).append(rpY_2.id_class(jsonElement, "skip"));
            }
        }
        return new uA_2(new rqO_2(rpY_2.id_case(jsonObject, "file")), rpY_2.id_class(jsonObject, "size", 11.0f), rpY_2.id_class(jsonObject, "oversample", 1.0f), f, f2, ((StringBuilder)object).toString());
    }

    @Override
    public uc_3 id_class(rAL rAL2) {
        uF_2 uF_22;
        block10: {
            STBTTFontinfo sTBTTFontinfo = null;
            ByteBuffer byteBuffer = null;
            rAF rAF2 = rAL2.id_class(new rqO_2(this.id_break.id_byte(), "font/" + this.id_break.id_break()));
            try {
                id_class.debug("Loading font {}", (Object)this.id_break);
                sTBTTFontinfo = STBTTFontinfo.malloc();
                byteBuffer = fo_3.id_class(rAF2.id_break());
                ((Buffer)byteBuffer).flip();
                id_class.debug("Reading font {}", (Object)this.id_break);
                if (!STBTruetype.stbtt_InitFont((STBTTFontinfo)sTBTTFontinfo, (ByteBuffer)byteBuffer)) {
                    throw new IOException("Invalid ttf");
                }
                uF_22 = new uF_2(byteBuffer, sTBTTFontinfo, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
                if (rAF2 == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    id_class.error("Couldn't load truetype font {}", (Object)this.id_break, (Object)exception);
                    if (sTBTTFontinfo != null) {
                        sTBTTFontinfo.free();
                    }
                    MemoryUtil.memFree(byteBuffer);
                    return null;
                }
            }
            rAF2.close();
        }
        return uF_22;
    }
}

