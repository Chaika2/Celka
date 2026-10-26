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
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_catch[0]]);
      this.id_goto();
      rrIk_1 var5 = new rrIk_1(id_byte[2], id_protected[0]);
      this.id_break[id_catch[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_byte[3], id_protected[1]);
      this.id_break[id_catch[2]] = var6;
      rrIk_1 var7 = new rrIk_1(id_byte[4], id_protected[2]);
      this.id_break[id_catch[3]] = var7;
      rrIk_1 var8 = new rrIk_1(id_byte[5], id_protected[3]);
      this.id_break[id_catch[4]] = var8;
      rrIk_1 var9 = new rrIk_1(id_byte[6], id_protected[4]);
      this.id_break[id_catch[5]] = var9;
      rrIk_1 var10 = new rrIk_1(id_byte[7], id_protected[5]);
      this.id_break[id_catch[6]] = var10;
      rrIk_1 var11 = new rrIk_1(id_byte[8], id_protected[6]);
      this.id_break[id_catch[7]] = var11;
      Setting[] var10001 = new Setting[id_private[0]];
      byte var10003 = id_protected[7];
      String var10006 = id_byte[9];
      Setting[] var10007 = new Setting[id_private[1]];
      var10007[id_protected[8]] = (rrIk_1)this.id_break[id_catch[8]];
      var10007[id_protected[9]] = (rrIk_1)this.id_break[id_catch[9]];
      var10007[id_private[2]] = (rrIk_1)this.id_break[id_catch[10]];
      var10007[id_private[3]] = (rrIk_1)this.id_break[id_catch[11]];
      var10007[id_private[4]] = (rrIk_1)this.id_break[id_catch[12]];
      var10007[id_private[5]] = (rrIk_1)this.id_break[id_catch[13]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      var10003 = id_protected[10];
      var10006 = id_byte[10];
      var10007 = new Setting[id_protected[11]];
      var10007[id_protected[12]] = (rrIk_1)this.id_break[id_catch[14]];
      var10001[var10003] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
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
         if (var4 != (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_catch[21]]) {
            ((cb_3)id_import.id_class[id_catch[22]]).id_case(id_byte[11]);
            var2.id_default().id_class(new Sl_1(var4.id_class() + var3.id_break(), var1));
         }
      }
   }

   @EventTarget
   public void id_class(rrLM var1) {
      this.id_byte(id_protected[16]);
   }

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      super.id_class(var1);
      HashMap var2 = new HashMap();
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_catch[23]], (rrIk_1)this.id_break[id_catch[24]]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_catch[25]], (rrIk_1)this.id_break[id_catch[26]]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_catch[27]], (rrIk_1)this.id_break[id_catch[28]]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_catch[29]], (rrIk_1)this.id_break[id_catch[30]]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_catch[31]], (rrIk_1)this.id_break[id_catch[32]]);
      var2.put((bE_2)bE_2.staticFields41d67a8911663c568d38045d1ac26747[id_catch[33]], (rrIk_1)this.id_break[id_catch[34]]);
      C_throws.id_byte().id_volatile().id_class(() -> this.id_super(), var2);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_goto();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[15]]
         && ((rrIk_1)this.id_break[id_catch[16]]).id_class()
         && !rrfZ_2.id_byte()
         && ((cb_3)id_import.id_class[id_catch[17]]).Pu()
         && this.id_super()) {
         boolean var2 = id_protected[13];

         for (an_3 var4 : ((gm_3)id_import.id_class[id_catch[18]]).id_byte()) {
            if (var4 instanceof iB_2 var5
               && var5.BC().id_throws().id_private()
               && !var5.BC().equals(aI_2.id_else)
               && var5.id_int((cb_3)id_import.id_class[id_catch[19]]) <= id_throws[0]
               && var5.Pu()
               && var5.id_while((cb_3)id_import.id_class[id_catch[20]])) {
               var2 = id_protected[14];
               break;
            }
         }

         if (var2) {
            this.id_class(id_private[6]);
            rrfu_3.id_byte(rrfu_3.id_class((Module)this) + "Найдено враждебное существо, перезаходим");
         }
      }
   }

   public void id_class(rVi_1 var1) {
      rVi_1 var2 = rrfu_3.id_break((Module)this).id_class(rgF_2.GRAY).id_class(var1);
      rrfu_3.id_class(var2);
      MinecraftAccessor.a_(var2.id_byte(), id_protected[20]);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2863523849789982629L;
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_byte(id_protected[15]);
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
         MinecraftAccessor.a_(var1, id_protected[21]);
         this.id_byte(id_protected[22]);
      }
   }

   private static void id_return() {
      id_private = new byte[]{2, 6, 2, 3, 4, 5, 120, 7};
   }

   private boolean id_super() {
      if (C_throws.id_byte().id_default().id_throws()) {
         return id_protected[17];
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
