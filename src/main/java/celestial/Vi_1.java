/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.lwjgl.glfw.GLFW
 */
package celestial;

import celestial.Va_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgX_2;
import celestial.rgn_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.BiFunction;
import org.lwjgl.glfw.GLFW;

public final class Vi_1
extends Enum<Vi_1> {
    public static final /* enum */ Vi_1 KEYSYM = new Vi_1("key.keyboard", (n, string) -> {
        String string2 = GLFW.glfwGetKeyName((int)n, (int)-1);
        return string2 != null ? new rgN_2(string2) : new rgn_3((String)string);
    });
    public static final /* enum */ Vi_1 SCANCODE = new Vi_1("scancode", (n, string) -> {
        String string2 = GLFW.glfwGetKeyName((int)-1, (int)n);
        return string2 != null ? new rgN_2(string2) : new rgn_3((String)string);
    });
    public static final /* enum */ Vi_1 MOUSE = new Vi_1("key.mouse", (n, string) -> rgX_2.id_byte().id_break((String)string) ? new rgn_3((String)string) : new rgn_3("key.mouse", n + 1));
    private final Int2ObjectMap<Va_1> inputs = new Int2ObjectOpenHashMap();
    public final String name;
    public final BiFunction<Integer, String, rgP_2> field_237522_f_;
    private static final /* synthetic */ Vi_1[] $VALUES;

    private Vi_1(String string2, BiFunction<Integer, String, rgP_2> biFunction) {
        this.name = string2;
        this.field_237522_f_ = biFunction;
    }

    static {
        $VALUES = Vi_1.id_class();
        Vi_1.id_class(KEYSYM, "key.keyboard.unknown", -1);
        Vi_1.id_class(MOUSE, "key.mouse.left", 0);
        Vi_1.id_class(MOUSE, "key.mouse.right", 1);
        Vi_1.id_class(MOUSE, "key.mouse.middle", 2);
        Vi_1.id_class(MOUSE, "key.mouse.4", 3);
        Vi_1.id_class(MOUSE, "key.mouse.5", 4);
        Vi_1.id_class(MOUSE, "key.mouse.6", 5);
        Vi_1.id_class(MOUSE, "key.mouse.7", 6);
        Vi_1.id_class(MOUSE, "key.mouse.8", 7);
        Vi_1.id_class(KEYSYM, "key.keyboard.0", 48);
        Vi_1.id_class(KEYSYM, "key.keyboard.1", 49);
        Vi_1.id_class(KEYSYM, "key.keyboard.2", 50);
        Vi_1.id_class(KEYSYM, "key.keyboard.3", 51);
        Vi_1.id_class(KEYSYM, "key.keyboard.4", 52);
        Vi_1.id_class(KEYSYM, "key.keyboard.5", 53);
        Vi_1.id_class(KEYSYM, "key.keyboard.6", 54);
        Vi_1.id_class(KEYSYM, "key.keyboard.7", 55);
        Vi_1.id_class(KEYSYM, "key.keyboard.8", 56);
        Vi_1.id_class(KEYSYM, "key.keyboard.9", 57);
        Vi_1.id_class(KEYSYM, "key.keyboard.a", 65);
        Vi_1.id_class(KEYSYM, "key.keyboard.b", 66);
        Vi_1.id_class(KEYSYM, "key.keyboard.c", 67);
        Vi_1.id_class(KEYSYM, "key.keyboard.d", 68);
        Vi_1.id_class(KEYSYM, "key.keyboard.e", 69);
        Vi_1.id_class(KEYSYM, "key.keyboard.f", 70);
        Vi_1.id_class(KEYSYM, "key.keyboard.g", 71);
        Vi_1.id_class(KEYSYM, "key.keyboard.h", 72);
        Vi_1.id_class(KEYSYM, "key.keyboard.i", 73);
        Vi_1.id_class(KEYSYM, "key.keyboard.j", 74);
        Vi_1.id_class(KEYSYM, "key.keyboard.k", 75);
        Vi_1.id_class(KEYSYM, "key.keyboard.l", 76);
        Vi_1.id_class(KEYSYM, "key.keyboard.m", 77);
        Vi_1.id_class(KEYSYM, "key.keyboard.n", 78);
        Vi_1.id_class(KEYSYM, "key.keyboard.o", 79);
        Vi_1.id_class(KEYSYM, "key.keyboard.p", 80);
        Vi_1.id_class(KEYSYM, "key.keyboard.q", 81);
        Vi_1.id_class(KEYSYM, "key.keyboard.r", 82);
        Vi_1.id_class(KEYSYM, "key.keyboard.s", 83);
        Vi_1.id_class(KEYSYM, "key.keyboard.t", 84);
        Vi_1.id_class(KEYSYM, "key.keyboard.u", 85);
        Vi_1.id_class(KEYSYM, "key.keyboard.v", 86);
        Vi_1.id_class(KEYSYM, "key.keyboard.w", 87);
        Vi_1.id_class(KEYSYM, "key.keyboard.x", 88);
        Vi_1.id_class(KEYSYM, "key.keyboard.y", 89);
        Vi_1.id_class(KEYSYM, "key.keyboard.z", 90);
        Vi_1.id_class(KEYSYM, "key.keyboard.f1", 290);
        Vi_1.id_class(KEYSYM, "key.keyboard.f2", 291);
        Vi_1.id_class(KEYSYM, "key.keyboard.f3", 292);
        Vi_1.id_class(KEYSYM, "key.keyboard.f4", 293);
        Vi_1.id_class(KEYSYM, "key.keyboard.f5", 294);
        Vi_1.id_class(KEYSYM, "key.keyboard.f6", 295);
        Vi_1.id_class(KEYSYM, "key.keyboard.f7", 296);
        Vi_1.id_class(KEYSYM, "key.keyboard.f8", 297);
        Vi_1.id_class(KEYSYM, "key.keyboard.f9", 298);
        Vi_1.id_class(KEYSYM, "key.keyboard.f10", 299);
        Vi_1.id_class(KEYSYM, "key.keyboard.f11", 300);
        Vi_1.id_class(KEYSYM, "key.keyboard.f12", 301);
        Vi_1.id_class(KEYSYM, "key.keyboard.f13", 302);
        Vi_1.id_class(KEYSYM, "key.keyboard.f14", 303);
        Vi_1.id_class(KEYSYM, "key.keyboard.f15", 304);
        Vi_1.id_class(KEYSYM, "key.keyboard.f16", 305);
        Vi_1.id_class(KEYSYM, "key.keyboard.f17", 306);
        Vi_1.id_class(KEYSYM, "key.keyboard.f18", 307);
        Vi_1.id_class(KEYSYM, "key.keyboard.f19", 308);
        Vi_1.id_class(KEYSYM, "key.keyboard.f20", 309);
        Vi_1.id_class(KEYSYM, "key.keyboard.f21", 310);
        Vi_1.id_class(KEYSYM, "key.keyboard.f22", 311);
        Vi_1.id_class(KEYSYM, "key.keyboard.f23", 312);
        Vi_1.id_class(KEYSYM, "key.keyboard.f24", 313);
        Vi_1.id_class(KEYSYM, "key.keyboard.f25", 314);
        Vi_1.id_class(KEYSYM, "key.keyboard.num.lock", 282);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.0", 320);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.1", 321);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.2", 322);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.3", 323);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.4", 324);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.5", 325);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.6", 326);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.7", 327);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.8", 328);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.9", 329);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.add", 334);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.decimal", 330);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.enter", 335);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.equal", 336);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.multiply", 332);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.divide", 331);
        Vi_1.id_class(KEYSYM, "key.keyboard.keypad.subtract", 333);
        Vi_1.id_class(KEYSYM, "key.keyboard.down", 264);
        Vi_1.id_class(KEYSYM, "key.keyboard.left", 263);
        Vi_1.id_class(KEYSYM, "key.keyboard.right", 262);
        Vi_1.id_class(KEYSYM, "key.keyboard.up", 265);
        Vi_1.id_class(KEYSYM, "key.keyboard.apostrophe", 39);
        Vi_1.id_class(KEYSYM, "key.keyboard.backslash", 92);
        Vi_1.id_class(KEYSYM, "key.keyboard.comma", 44);
        Vi_1.id_class(KEYSYM, "key.keyboard.equal", 61);
        Vi_1.id_class(KEYSYM, "key.keyboard.grave.accent", 96);
        Vi_1.id_class(KEYSYM, "key.keyboard.left.bracket", 91);
        Vi_1.id_class(KEYSYM, "key.keyboard.minus", 45);
        Vi_1.id_class(KEYSYM, "key.keyboard.period", 46);
        Vi_1.id_class(KEYSYM, "key.keyboard.right.bracket", 93);
        Vi_1.id_class(KEYSYM, "key.keyboard.semicolon", 59);
        Vi_1.id_class(KEYSYM, "key.keyboard.slash", 47);
        Vi_1.id_class(KEYSYM, "key.keyboard.space", 32);
        Vi_1.id_class(KEYSYM, "key.keyboard.tab", 258);
        Vi_1.id_class(KEYSYM, "key.keyboard.left.alt", 342);
        Vi_1.id_class(KEYSYM, "key.keyboard.left.control", 341);
        Vi_1.id_class(KEYSYM, "key.keyboard.left.shift", 340);
        Vi_1.id_class(KEYSYM, "key.keyboard.left.win", 343);
        Vi_1.id_class(KEYSYM, "key.keyboard.right.alt", 346);
        Vi_1.id_class(KEYSYM, "key.keyboard.right.control", 345);
        Vi_1.id_class(KEYSYM, "key.keyboard.right.shift", 344);
        Vi_1.id_class(KEYSYM, "key.keyboard.right.win", 347);
        Vi_1.id_class(KEYSYM, "key.keyboard.enter", 257);
        Vi_1.id_class(KEYSYM, "key.keyboard.escape", 256);
        Vi_1.id_class(KEYSYM, "key.keyboard.backspace", 259);
        Vi_1.id_class(KEYSYM, "key.keyboard.delete", 261);
        Vi_1.id_class(KEYSYM, "key.keyboard.end", 269);
        Vi_1.id_class(KEYSYM, "key.keyboard.home", 268);
        Vi_1.id_class(KEYSYM, "key.keyboard.insert", 260);
        Vi_1.id_class(KEYSYM, "key.keyboard.page.down", 267);
        Vi_1.id_class(KEYSYM, "key.keyboard.page.up", 266);
        Vi_1.id_class(KEYSYM, "key.keyboard.caps.lock", 280);
        Vi_1.id_class(KEYSYM, "key.keyboard.pause", 284);
        Vi_1.id_class(KEYSYM, "key.keyboard.scroll.lock", 281);
        Vi_1.id_class(KEYSYM, "key.keyboard.menu", 348);
        Vi_1.id_class(KEYSYM, "key.keyboard.print.screen", 283);
        Vi_1.id_class(KEYSYM, "key.keyboard.world.1", 161);
        Vi_1.id_class(KEYSYM, "key.keyboard.world.2", 162);
    }

    public static Vi_1[] values() {
        return (Vi_1[])$VALUES.clone();
    }

    public static Vi_1 valueOf(String string) {
        return Enum.valueOf(Vi_1.class, string);
    }

    private static /* synthetic */ Vi_1[] id_class() {
        return new Vi_1[]{KEYSYM, SCANCODE, MOUSE};
    }

    private static void id_class(Vi_1 vi_1, String string, int n) {
        Va_1 va_1 = new Va_1(string, vi_1, n);
        vi_1.inputs.put(n, (Object)va_1);
    }

    public Va_1 id_class(int n2) {
        return (Va_1)this.inputs.computeIfAbsent(n2, n -> {
            int n2 = n;
            if (this == MOUSE) {
                n2 = n + 1;
            }
            String string = this.name + "." + n2;
            return new Va_1(string, this, n);
        });
    }
}

