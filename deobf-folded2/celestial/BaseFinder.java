package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BaseFinder extends Module {
   private static String[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;
   private static double[] id_throws;
   private static short[] id_catch;
   private static byte[] id_private;

   public BaseFinder() {
      super("Base Finder", "Утилитарный модуль для поиска\nбаз", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_goto();
      rrIk_1 var5 = new rrIk_1("Сундуки", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Шалкера", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Бочки", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Наковальни", false);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Столы зачарования", false);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Печки", false);
      this.id_break[5] = var10;
      rrIk_1 var11 = new rrIk_1("Избегать враждебных\nсуществ", true);
      this.id_break[6] = var11;
      this.id_class(
         new Setting[]{
            new GroupSetting(
               "Триггеры",
               (rrIk_1)this.id_break[0],
               (rrIk_1)this.id_break[1],
               (rrIk_1)this.id_break[2],
               (rrIk_1)this.id_break[3],
               (rrIk_1)this.id_break[4],
               (rrIk_1)this.id_break[5]
            ),
            new GroupSetting("Другое", (rrIk_1)this.id_break[6])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new double[]{100.0};
   }

   public void id_class(int var1) {
      C_class var2 = C_throws.id_byte();
      PI var3 = var2.id_native().id_protected();
      if (var3 != null) {
         Pf_1 var4 = var3.id_class();
         if (var4 != (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2]) {
            ((cb_3)id_import.id_class[57]).id_case("/hub");
            var2.id_default().id_class(new Sl_1(var4.id_class() + var3.id_break(), var1));
         }
      }
   }

   @EventTarget
   public void id_class(rrLM var1) {
      this.id_byte(false);
   }

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      super.id_class(var1);
      HashMap var2 = new HashMap();
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[0], (rrIk_1)this.id_break[0]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[1], (rrIk_1)this.id_break[1]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[4], (rrIk_1)this.id_break[2]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[2], (rrIk_1)this.id_break[3]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[3], (rrIk_1)this.id_break[4]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[5], (rrIk_1)this.id_break[5]);
      C_throws.id_byte().id_volatile().id_class(() -> this.id_super(), var2);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_goto();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]
         && ((rrIk_1)this.id_break[6]).id_class()
         && !rrfZ_2.id_byte()
         && ((cb_3)id_import.id_class[57]).Pu()
         && this.id_super()) {
         boolean var2 = false;

         for (an_3 var4 : ((gm_3)id_import.id_class[56]).id_byte()) {
            if (var4 instanceof iB_2 var5
               && var5.BC().id_throws().id_private()
               && !var5.BC().equals(aI_2.id_else)
               && var5.id_int((cb_3)id_import.id_class[57]) <= 100.0
               && var5.Pu()
               && var5.id_while((cb_3)id_import.id_class[57])) {
               var2 = true;
               break;
            }
         }

         if (var2) {
            this.id_class(120);
            rrfu_3.id_byte(rrfu_3.id_class((Module)this) + "Найдено враждебное существо, перезаходим");
         }
      }
   }

   public void id_class(rVi_1 var1) {
      rVi_1 var2 = rrfu_3.id_break((Module)this).id_class(rgF_2.GRAY).id_class(var1);
      rrfu_3.id_class(var2);
      MinecraftAccessor.a_(var2.id_byte(), false);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2863523849789982629L;
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(false);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -454492118;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-83, -86, -81, 68, -35, 67, -126, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      if (this.aJ_()) {
         C_throws.id_byte().id_volatile().id_private();
      }
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
      }
   }

   private static void id_continue() {
      id_protected = new boolean[]{
         true, true, true, false, false, false, true, false, false, true, true, true, false, false, true, false, false, false, false, true, false, false, true
      };
   }

   private static void id_else() {
      id_catch = new short[]{4, 0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 3, 4, 5, 6, 0, 6, 57, 56, 57, 57, 2, 57, 0, 0, 1, 1, 4, 2, 2, 3, 3, 4, 5, 5};
   }

   public void id_new() {
      if (this.aJ_()) {
         String var1 = rrfu_3.id_class((Module)this) + "Достигнута граница мира";
         rrfu_3.id_byte(var1);
         MinecraftAccessor.a_(var1, false);
         this.id_byte(true);
      }
   }

   private static void id_return() {
      id_private = new byte[]{2, 6, 2, 3, 4, 5, 120, 7};
   }

   private boolean id_super() {
      if (C_throws.id_byte().id_default().id_throws()) {
         return false;
      } else {
         PI var1 = C_throws.id_byte().id_native().id_protected();
         if (var1 != null) {
            Pf_1 var2 = var1.id_class();
            if (var2 == null || !var2.id_break()) {
               return id_protected[18];
            }
         }

         return id_protected[19];
      }
   }

   private static void id_public() {
      id_byte = new String[]{
         new String("Base Finder"),
         new String("Утилитарный модуль для поиска\nбаз"),
         new String("Сундуки"),
         new String("Шалкера"),
         new String("Бочки"),
         new String("Наковальни"),
         new String("Столы зачарования"),
         new String("Печки"),
         new String("Избегать враждебных\nсуществ"),
         new String("Триггеры"),
         new String("Другое"),
         new String("/hub")
      };
   }
}
