package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ArrayListHud extends Module {
   private static float[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_catch;
   public static Object[] id_break;
   private static byte[] id_private;
   private static short[] id_implements;
   public Object[] id_byte;

   public ArrayListHud() {
      super("Array List", "Отображает список включенных\nмодулей", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[2]);
      this.id_continue();
      ArrayList var5 = new ArrayList();
      this.id_byte[0] = var5;
      rrIk_1 var6 = new rrIk_1("Combat", true);
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1("Movement", true);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1("Render", false);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1("Player", true);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1("Util", true);
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1("Свечение", true);
      this.id_byte[6] = var11;
      rrIk_1 var12 = new rrIk_1("Маленькие буквы", false).id_class("lowercase", (var1, var2) -> {
         this.id_continue();
         Boolean var3 = (Boolean)var2.getLeft();
         ((List)this.id_byte[0]).forEach(var1x -> var1x.id_break(var3));
         this.id_else();
      });
      this.id_byte[7] = var12;
      rrIm_1 var13 = new rrIm_1("Смещение", 2.0F, 0.0F, 10.0F, 1.0F);
      this.id_byte[8] = var13;
      this.id_class(
         new Setting[]{
            new rrIc_1("Категории", (rrIk_1)this.id_byte[1], (rrIk_1)this.id_byte[2], (rrIk_1)this.id_byte[3], (rrIk_1)this.id_byte[4], (rrIk_1)this.id_byte[5]),
            (rrIk_1)this.id_byte[7],
            (rrIk_1)this.id_byte[6],
            (rrIm_1)this.id_byte[8]
         }
      );
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(new OH<>(rrLP.class, var1 -> this.id_class(var1)));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new String[]{
         new String("Array List"),
         new String("Отображает список включенных\nмодулей"),
         new String("Combat"),
         new String("Movement"),
         new String("Render"),
         new String("Player"),
         new String("Util"),
         new String("Свечение"),
         new String("Маленькие буквы"),
         new String("lowercase"),
         new String("Смещение"),
         new String("Категории")
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1704764733;
   }

   public void id_class(rrLP var1) {
      this.id_continue();

      for (Module var3 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().g()) {
         ((List)this.id_byte[0]).add(new rrqA_2(this, var3));
      }

      this.id_else();
   }

   @EventTarget
   public void id_class(rrnB_2 var1) {
      this.id_continue();
      if (!((Qw_1)id_import.id_class[20]).R && !((List)this.id_byte[0]).isEmpty()) {
         float var2 = id_protected[4];
         float var3 = ((rrIm_1)this.id_byte[8]).id_byte();
         float var4 = ((rrIm_1)this.id_byte[8]).id_byte() + 5.0F;
         Ml_1 var5 = var1.id_class();
         float var6 = id_const.id_volatile();
         float var10 = var2 / 2.5F;
         int var12 = ColorHelper.id_class(0.0F);
         ArrayList var13 = new ArrayList();

         for (rrqA_2 var15 : (List)this.id_byte[0]) {
            var15.id_class(this.id_class((Module)var15.id_class[0]));
            if (((AnimValue)var15.id_class[1]).id_case()) {
               var13.add(var15);
            }
         }

         var5.id_class();
         if (((rrIk_1)this.id_byte[6]).id_class()) {
            for (rrqA_2 var24 : var13) {
               float var8 = (Float)var24.id_class[3];
               float var7 = var6 + 120.0F - var8 - var4;
               var7 -= 120.0F * var24.id_byte();
               int var11 = ColorHelper.id_class(-var3);
               float var9 = var8 + 4.0F;
               rrfD_2.id_class(var5, var7, var3, var9 + 2.0F, var2 + 1.0F, 12, var11);
               var3 += var2 * var24.id_byte();
            }

            var3 = ((rrIm_1)this.id_byte[8]).id_byte();
         }

         rrfD_2.id_throws((lD_2)id_break[0]);
         ((rrZO)id_break[1]).id_break(id_strictfp);

         for (rrqA_2 var25 : var13) {
            float var19 = (Float)var25.id_class[3];
            float var17 = var6 + 120.0F - var19 - var4;
            var17 -= 120.0F * var25.id_byte();
            int var21 = ColorHelper.id_class(-var3);
            float var20 = var19 + 4.0F;
            rrfD_2.id_class(var5, (lD_2)id_break[0], var17, var3, var20, var2, ColorHelper.id_break(rrZF.n_, (int)(225.0F * var25.id_byte())));
            rrfD_2.id_class(var5, (lD_2)id_break[0], var17 + var20, var3, 0.5F, var2, var12, var21);
            var12 = var21;
            ((rrZO)id_break[1]).id_break(var5, id_strictfp, (String)var25.id_class[2], (double)(var17 + 2.0F), (double)(var3 + var10), var21, false, false);
            var3 += var2 * var25.id_byte();
         }

         rrfD_2.id_private((lD_2)id_break[0]);
         ((rrZO)id_break[1]).id_byte(id_strictfp);
         var5.id_break();
      }
   }

   private boolean id_class(Module var1) {
      this.id_continue();
      if (!var1.aJ_()) {
         return false;
      } else {
         switch (((int[])rrqL_2.id_class[0])[var1.id_int().ordinal()]) {
            case 1:
               return ((rrIk_1)this.id_byte[1]).id_class();
            case 2:
               return ((rrIk_1)this.id_byte[2]).id_class();
            case 3:
               return !((rrIk_1)this.id_byte[3]).id_class() && !(var1 instanceof Hud) && !(var1 instanceof Esp2D) ? id_catch[15] : id_catch[14];
            case 4:
               return ((rrIk_1)this.id_byte[4]).id_class();
            case 5:
               return ((rrIk_1)this.id_byte[5]).id_class();
            default:
               return id_catch[16];
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7121994137951204165L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -14, -101, -111, 100, 81, -21, 120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_goto() {
      id_catch = new boolean[]{
         true, true, false, true, true, true, false, false, false, true, true, false, false, false, true, false, false, false, false, true
      };
   }

   private void id_continue() {
      if (this.id_byte == null) {
         this.id_byte = new Object[9];
      }
   }

   private void id_else() {
      this.id_continue();
      ((List)this.id_byte[0]).sort(Comparator.comparingDouble(var0 -> (double)(-var0.id_protected())));
   }

   private static void id_new() {
      id_protected = new float[]{
         2.0F, 0.0F, 10.0F, 1.0F, 10.0F, 5.0F, 2.5F, 0.0F, 120.0F, 120.0F, 4.0F, 2.0F, 1.0F, 120.0F, 120.0F, 4.0F, 225.0F, 0.5F, 2.0F, 0.4F
      };
   }

   private static void id_return() {
      Object[] var0 = new Object[]{new lD_2(256), FontManager.id_class("montserrat", 13.0F, false), -1.0842022E-19F, 120};
      id_break = var0;
   }

   private static void id_super() {
      id_private = new byte[]{4, 5, 2, 3, 4, 2, 3, 12, 9, 4, 2, 3, 120};
   }

   private static void id_public() {
      id_implements = new short[]{
         2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 7, 6, 8, 0, 0, 0, 20, 0, 8, 8, 0, 0, 1, 6, 3, 8, 0, 1, 3, 0, 0, 1, 2, 0, 1, 0, 1, 2, 3, 4, 5, 0, 0, 256
      };
   }
}
