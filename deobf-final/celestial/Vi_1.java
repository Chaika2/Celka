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
   MOUSE("key.mouse", (var0, var1) -> rgX_2.byte_().break_(var1) ? new rgn_3(var1) : new rgn_3("key.mouse", var0 + 1));

   private final Int2ObjectMap<Va_1> inputs = new Int2ObjectOpenHashMap();
   final String name;
   final BiFunction<Integer, String, rgP_2> field_237522_f_;

   private Vi_1(String var3, BiFunction<Integer, String, rgP_2> var4) {
      this.name = var3;
      this.field_237522_f_ = var4;
   }

   static {
      class_(KEYSYM, "key.keyboard.unknown", -1);
      class_(MOUSE, "key.mouse.left", 0);
      class_(MOUSE, "key.mouse.right", 1);
      class_(MOUSE, "key.mouse.middle", 2);
      class_(MOUSE, "key.mouse.4", 3);
      class_(MOUSE, "key.mouse.5", 4);
      class_(MOUSE, "key.mouse.6", 5);
      class_(MOUSE, "key.mouse.7", 6);
      class_(MOUSE, "key.mouse.8", 7);
      class_(KEYSYM, "key.keyboard.0", 48);
      class_(KEYSYM, "key.keyboard.1", 49);
      class_(KEYSYM, "key.keyboard.2", 50);
      class_(KEYSYM, "key.keyboard.3", 51);
      class_(KEYSYM, "key.keyboard.4", 52);
      class_(KEYSYM, "key.keyboard.5", 53);
      class_(KEYSYM, "key.keyboard.6", 54);
      class_(KEYSYM, "key.keyboard.7", 55);
      class_(KEYSYM, "key.keyboard.8", 56);
      class_(KEYSYM, "key.keyboard.9", 57);
      class_(KEYSYM, "key.keyboard.a", 65);
      class_(KEYSYM, "key.keyboard.b", 66);
      class_(KEYSYM, "key.keyboard.c", 67);
      class_(KEYSYM, "key.keyboard.d", 68);
      class_(KEYSYM, "key.keyboard.e", 69);
      class_(KEYSYM, "key.keyboard.f", 70);
      class_(KEYSYM, "key.keyboard.g", 71);
      class_(KEYSYM, "key.keyboard.h", 72);
      class_(KEYSYM, "key.keyboard.i", 73);
      class_(KEYSYM, "key.keyboard.j", 74);
      class_(KEYSYM, "key.keyboard.k", 75);
      class_(KEYSYM, "key.keyboard.l", 76);
      class_(KEYSYM, "key.keyboard.m", 77);
      class_(KEYSYM, "key.keyboard.n", 78);
      class_(KEYSYM, "key.keyboard.o", 79);
      class_(KEYSYM, "key.keyboard.p", 80);
      class_(KEYSYM, "key.keyboard.q", 81);
      class_(KEYSYM, "key.keyboard.r", 82);
      class_(KEYSYM, "key.keyboard.s", 83);
      class_(KEYSYM, "key.keyboard.t", 84);
      class_(KEYSYM, "key.keyboard.u", 85);
      class_(KEYSYM, "key.keyboard.v", 86);
      class_(KEYSYM, "key.keyboard.w", 87);
      class_(KEYSYM, "key.keyboard.x", 88);
      class_(KEYSYM, "key.keyboard.y", 89);
      class_(KEYSYM, "key.keyboard.z", 90);
      class_(KEYSYM, "key.keyboard.f1", 290);
      class_(KEYSYM, "key.keyboard.f2", 291);
      class_(KEYSYM, "key.keyboard.f3", 292);
      class_(KEYSYM, "key.keyboard.f4", 293);
      class_(KEYSYM, "key.keyboard.f5", 294);
      class_(KEYSYM, "key.keyboard.f6", 295);
      class_(KEYSYM, "key.keyboard.f7", 296);
      class_(KEYSYM, "key.keyboard.f8", 297);
      class_(KEYSYM, "key.keyboard.f9", 298);
      class_(KEYSYM, "key.keyboard.f10", 299);
      class_(KEYSYM, "key.keyboard.f11", 300);
      class_(KEYSYM, "key.keyboard.f12", 301);
      class_(KEYSYM, "key.keyboard.f13", 302);
      class_(KEYSYM, "key.keyboard.f14", 303);
      class_(KEYSYM, "key.keyboard.f15", 304);
      class_(KEYSYM, "key.keyboard.f16", 305);
      class_(KEYSYM, "key.keyboard.f17", 306);
      class_(KEYSYM, "key.keyboard.f18", 307);
      class_(KEYSYM, "key.keyboard.f19", 308);
      class_(KEYSYM, "key.keyboard.f20", 309);
      class_(KEYSYM, "key.keyboard.f21", 310);
      class_(KEYSYM, "key.keyboard.f22", 311);
      class_(KEYSYM, "key.keyboard.f23", 312);
      class_(KEYSYM, "key.keyboard.f24", 313);
      class_(KEYSYM, "key.keyboard.f25", 314);
      class_(KEYSYM, "key.keyboard.num.lock", 282);
      class_(KEYSYM, "key.keyboard.keypad.0", 320);
      class_(KEYSYM, "key.keyboard.keypad.1", 321);
      class_(KEYSYM, "key.keyboard.keypad.2", 322);
      class_(KEYSYM, "key.keyboard.keypad.3", 323);
      class_(KEYSYM, "key.keyboard.keypad.4", 324);
      class_(KEYSYM, "key.keyboard.keypad.5", 325);
      class_(KEYSYM, "key.keyboard.keypad.6", 326);
      class_(KEYSYM, "key.keyboard.keypad.7", 327);
      class_(KEYSYM, "key.keyboard.keypad.8", 328);
      class_(KEYSYM, "key.keyboard.keypad.9", 329);
      class_(KEYSYM, "key.keyboard.keypad.add", 334);
      class_(KEYSYM, "key.keyboard.keypad.decimal", 330);
      class_(KEYSYM, "key.keyboard.keypad.enter", 335);
      class_(KEYSYM, "key.keyboard.keypad.equal", 336);
      class_(KEYSYM, "key.keyboard.keypad.multiply", 332);
      class_(KEYSYM, "key.keyboard.keypad.divide", 331);
      class_(KEYSYM, "key.keyboard.keypad.subtract", 333);
      class_(KEYSYM, "key.keyboard.down", 264);
      class_(KEYSYM, "key.keyboard.left", 263);
      class_(KEYSYM, "key.keyboard.right", 262);
      class_(KEYSYM, "key.keyboard.up", 265);
      class_(KEYSYM, "key.keyboard.apostrophe", 39);
      class_(KEYSYM, "key.keyboard.backslash", 92);
      class_(KEYSYM, "key.keyboard.comma", 44);
      class_(KEYSYM, "key.keyboard.equal", 61);
      class_(KEYSYM, "key.keyboard.grave.accent", 96);
      class_(KEYSYM, "key.keyboard.left.bracket", 91);
      class_(KEYSYM, "key.keyboard.minus", 45);
      class_(KEYSYM, "key.keyboard.period", 46);
      class_(KEYSYM, "key.keyboard.right.bracket", 93);
      class_(KEYSYM, "key.keyboard.semicolon", 59);
      class_(KEYSYM, "key.keyboard.slash", 47);
      class_(KEYSYM, "key.keyboard.space", 32);
      class_(KEYSYM, "key.keyboard.tab", 258);
      class_(KEYSYM, "key.keyboard.left.alt", 342);
      class_(KEYSYM, "key.keyboard.left.control", 341);
      class_(KEYSYM, "key.keyboard.left.shift", 340);
      class_(KEYSYM, "key.keyboard.left.win", 343);
      class_(KEYSYM, "key.keyboard.right.alt", 346);
      class_(KEYSYM, "key.keyboard.right.control", 345);
      class_(KEYSYM, "key.keyboard.right.shift", 344);
      class_(KEYSYM, "key.keyboard.right.win", 347);
      class_(KEYSYM, "key.keyboard.enter", 257);
      class_(KEYSYM, "key.keyboard.escape", 256);
      class_(KEYSYM, "key.keyboard.backspace", 259);
      class_(KEYSYM, "key.keyboard.delete", 261);
      class_(KEYSYM, "key.keyboard.end", 269);
      class_(KEYSYM, "key.keyboard.home", 268);
      class_(KEYSYM, "key.keyboard.insert", 260);
      class_(KEYSYM, "key.keyboard.page.down", 267);
      class_(KEYSYM, "key.keyboard.page.up", 266);
      class_(KEYSYM, "key.keyboard.caps.lock", 280);
      class_(KEYSYM, "key.keyboard.pause", 284);
      class_(KEYSYM, "key.keyboard.scroll.lock", 281);
      class_(KEYSYM, "key.keyboard.menu", 348);
      class_(KEYSYM, "key.keyboard.print.screen", 283);
      class_(KEYSYM, "key.keyboard.world.1", 161);
      class_(KEYSYM, "key.keyboard.world.2", 162);
   }

   private static void class_(Vi_1 var0, String var1, int var2) {
      Va_1 var3 = new Va_1(var1, var0, var2);
      var0.inputs.put(var2, var3);
   }

   public Va_1 class_(int var1) {
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
