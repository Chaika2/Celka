package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.BiFunction;
import org.lwjgl.glfw.GLFW;

public enum Vi_1 {
   KEYSYM("key.keyboard", (var0, var1) -> {
      String var2 = GLFW.glfwGetKeyName(var0, -1);
      return (rgP_2)(var2 != null ? new rgN_2(var2) : new rgn_3(var1));
   }),
   SCANCODE("scancode", (var0, var1) -> {
      String var2 = GLFW.glfwGetKeyName(-1, var0);
      return (rgP_2)(var2 != null ? new rgN_2(var2) : new rgn_3(var1));
   }),
   MOUSE("key.mouse", (var0, var1) -> rgX_2.id_byte().id_break(var1) ? new rgn_3(var1) : new rgn_3("key.mouse", var0 + 1));

   private final Int2ObjectMap<Va_1> inputs = new Int2ObjectOpenHashMap();
   final String name;
   final BiFunction<Integer, String, rgP_2> field_237522_f_;

   private Vi_1(String var3, BiFunction<Integer, String, rgP_2> var4) {
      this.name = var3;
      this.field_237522_f_ = var4;
   }

   static {
      id_class(KEYSYM, "key.keyboard.unknown", -1);
      id_class(MOUSE, "key.mouse.left", 0);
      id_class(MOUSE, "key.mouse.right", 1);
      id_class(MOUSE, "key.mouse.middle", 2);
      id_class(MOUSE, "key.mouse.4", 3);
      id_class(MOUSE, "key.mouse.5", 4);
      id_class(MOUSE, "key.mouse.6", 5);
      id_class(MOUSE, "key.mouse.7", 6);
      id_class(MOUSE, "key.mouse.8", 7);
      id_class(KEYSYM, "key.keyboard.0", 48);
      id_class(KEYSYM, "key.keyboard.1", 49);
      id_class(KEYSYM, "key.keyboard.2", 50);
      id_class(KEYSYM, "key.keyboard.3", 51);
      id_class(KEYSYM, "key.keyboard.4", 52);
      id_class(KEYSYM, "key.keyboard.5", 53);
      id_class(KEYSYM, "key.keyboard.6", 54);
      id_class(KEYSYM, "key.keyboard.7", 55);
      id_class(KEYSYM, "key.keyboard.8", 56);
      id_class(KEYSYM, "key.keyboard.9", 57);
      id_class(KEYSYM, "key.keyboard.a", 65);
      id_class(KEYSYM, "key.keyboard.b", 66);
      id_class(KEYSYM, "key.keyboard.c", 67);
      id_class(KEYSYM, "key.keyboard.d", 68);
      id_class(KEYSYM, "key.keyboard.e", 69);
      id_class(KEYSYM, "key.keyboard.f", 70);
      id_class(KEYSYM, "key.keyboard.g", 71);
      id_class(KEYSYM, "key.keyboard.h", 72);
      id_class(KEYSYM, "key.keyboard.i", 73);
      id_class(KEYSYM, "key.keyboard.j", 74);
      id_class(KEYSYM, "key.keyboard.k", 75);
      id_class(KEYSYM, "key.keyboard.l", 76);
      id_class(KEYSYM, "key.keyboard.m", 77);
      id_class(KEYSYM, "key.keyboard.n", 78);
      id_class(KEYSYM, "key.keyboard.o", 79);
      id_class(KEYSYM, "key.keyboard.p", 80);
      id_class(KEYSYM, "key.keyboard.q", 81);
      id_class(KEYSYM, "key.keyboard.r", 82);
      id_class(KEYSYM, "key.keyboard.s", 83);
      id_class(KEYSYM, "key.keyboard.t", 84);
      id_class(KEYSYM, "key.keyboard.u", 85);
      id_class(KEYSYM, "key.keyboard.v", 86);
      id_class(KEYSYM, "key.keyboard.w", 87);
      id_class(KEYSYM, "key.keyboard.x", 88);
      id_class(KEYSYM, "key.keyboard.y", 89);
      id_class(KEYSYM, "key.keyboard.z", 90);
      id_class(KEYSYM, "key.keyboard.f1", 290);
      id_class(KEYSYM, "key.keyboard.f2", 291);
      id_class(KEYSYM, "key.keyboard.f3", 292);
      id_class(KEYSYM, "key.keyboard.f4", 293);
      id_class(KEYSYM, "key.keyboard.f5", 294);
      id_class(KEYSYM, "key.keyboard.f6", 295);
      id_class(KEYSYM, "key.keyboard.f7", 296);
      id_class(KEYSYM, "key.keyboard.f8", 297);
      id_class(KEYSYM, "key.keyboard.f9", 298);
      id_class(KEYSYM, "key.keyboard.f10", 299);
      id_class(KEYSYM, "key.keyboard.f11", 300);
      id_class(KEYSYM, "key.keyboard.f12", 301);
      id_class(KEYSYM, "key.keyboard.f13", 302);
      id_class(KEYSYM, "key.keyboard.f14", 303);
      id_class(KEYSYM, "key.keyboard.f15", 304);
      id_class(KEYSYM, "key.keyboard.f16", 305);
      id_class(KEYSYM, "key.keyboard.f17", 306);
      id_class(KEYSYM, "key.keyboard.f18", 307);
      id_class(KEYSYM, "key.keyboard.f19", 308);
      id_class(KEYSYM, "key.keyboard.f20", 309);
      id_class(KEYSYM, "key.keyboard.f21", 310);
      id_class(KEYSYM, "key.keyboard.f22", 311);
      id_class(KEYSYM, "key.keyboard.f23", 312);
      id_class(KEYSYM, "key.keyboard.f24", 313);
      id_class(KEYSYM, "key.keyboard.f25", 314);
      id_class(KEYSYM, "key.keyboard.num.lock", 282);
      id_class(KEYSYM, "key.keyboard.keypad.0", 320);
      id_class(KEYSYM, "key.keyboard.keypad.1", 321);
      id_class(KEYSYM, "key.keyboard.keypad.2", 322);
      id_class(KEYSYM, "key.keyboard.keypad.3", 323);
      id_class(KEYSYM, "key.keyboard.keypad.4", 324);
      id_class(KEYSYM, "key.keyboard.keypad.5", 325);
      id_class(KEYSYM, "key.keyboard.keypad.6", 326);
      id_class(KEYSYM, "key.keyboard.keypad.7", 327);
      id_class(KEYSYM, "key.keyboard.keypad.8", 328);
      id_class(KEYSYM, "key.keyboard.keypad.9", 329);
      id_class(KEYSYM, "key.keyboard.keypad.add", 334);
      id_class(KEYSYM, "key.keyboard.keypad.decimal", 330);
      id_class(KEYSYM, "key.keyboard.keypad.enter", 335);
      id_class(KEYSYM, "key.keyboard.keypad.equal", 336);
      id_class(KEYSYM, "key.keyboard.keypad.multiply", 332);
      id_class(KEYSYM, "key.keyboard.keypad.divide", 331);
      id_class(KEYSYM, "key.keyboard.keypad.subtract", 333);
      id_class(KEYSYM, "key.keyboard.down", 264);
      id_class(KEYSYM, "key.keyboard.left", 263);
      id_class(KEYSYM, "key.keyboard.right", 262);
      id_class(KEYSYM, "key.keyboard.up", 265);
      id_class(KEYSYM, "key.keyboard.apostrophe", 39);
      id_class(KEYSYM, "key.keyboard.backslash", 92);
      id_class(KEYSYM, "key.keyboard.comma", 44);
      id_class(KEYSYM, "key.keyboard.equal", 61);
      id_class(KEYSYM, "key.keyboard.grave.accent", 96);
      id_class(KEYSYM, "key.keyboard.left.bracket", 91);
      id_class(KEYSYM, "key.keyboard.minus", 45);
      id_class(KEYSYM, "key.keyboard.period", 46);
      id_class(KEYSYM, "key.keyboard.right.bracket", 93);
      id_class(KEYSYM, "key.keyboard.semicolon", 59);
      id_class(KEYSYM, "key.keyboard.slash", 47);
      id_class(KEYSYM, "key.keyboard.space", 32);
      id_class(KEYSYM, "key.keyboard.tab", 258);
      id_class(KEYSYM, "key.keyboard.left.alt", 342);
      id_class(KEYSYM, "key.keyboard.left.control", 341);
      id_class(KEYSYM, "key.keyboard.left.shift", 340);
      id_class(KEYSYM, "key.keyboard.left.win", 343);
      id_class(KEYSYM, "key.keyboard.right.alt", 346);
      id_class(KEYSYM, "key.keyboard.right.control", 345);
      id_class(KEYSYM, "key.keyboard.right.shift", 344);
      id_class(KEYSYM, "key.keyboard.right.win", 347);
      id_class(KEYSYM, "key.keyboard.enter", 257);
      id_class(KEYSYM, "key.keyboard.escape", 256);
      id_class(KEYSYM, "key.keyboard.backspace", 259);
      id_class(KEYSYM, "key.keyboard.delete", 261);
      id_class(KEYSYM, "key.keyboard.end", 269);
      id_class(KEYSYM, "key.keyboard.home", 268);
      id_class(KEYSYM, "key.keyboard.insert", 260);
      id_class(KEYSYM, "key.keyboard.page.down", 267);
      id_class(KEYSYM, "key.keyboard.page.up", 266);
      id_class(KEYSYM, "key.keyboard.caps.lock", 280);
      id_class(KEYSYM, "key.keyboard.pause", 284);
      id_class(KEYSYM, "key.keyboard.scroll.lock", 281);
      id_class(KEYSYM, "key.keyboard.menu", 348);
      id_class(KEYSYM, "key.keyboard.print.screen", 283);
      id_class(KEYSYM, "key.keyboard.world.1", 161);
      id_class(KEYSYM, "key.keyboard.world.2", 162);
   }

   private static void id_class(Vi_1 var0, String var1, int var2) {
      Va_1 var3 = new Va_1(var1, var0, var2);
      var0.inputs.put(var2, var3);
   }

   public Va_1 id_class(int var1) {
      return (Va_1)this.inputs.computeIfAbsent(var1, var1x -> {
         int var2 = var1x;
         if (this == MOUSE) {
            var2 = var1x + 1;
         }

         String var3 = this.name + "." + var2;
         return new Va_1(var3, this, var1x);
      });
   }
}
