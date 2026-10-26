package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class RwHelper extends Module {
   private static float[] id_byte;
   public Object[] id_break;
   private static long[] id_protected;
   private static String[] id_throws;
   private static byte[] id_catch;
   private static short[] id_private;
   private static boolean[] id_implements;

   public RwHelper() {
      super("RW Helper", "Утилитарный модуль для\nReallyWorld", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.id_super();
      rrIk_1 var5 = new rrIk_1("Флай на драгоне", true);
      this.id_break[0] = var5;
      rrIk_1 var6 = new rrIk_1("Закрытие меню", true);
      this.id_break[1] = var6;
      rrIk_1 var7 = new rrIk_1("Не ставить шары", true);
      this.id_break[2] = var7;
      rrIk_1 var8 = new rrIk_1("Авто. полёт", true);
      this.id_break[3] = var8;
      rrIk_1 var9 = new rrIk_1("Авто. починка", true);
      this.id_break[4] = var9;
      rrIk_1 var10 = new rrIk_1("Авто. исцеление", true);
      this.id_break[5] = var10;
      CopyOnWriteArrayList var11 = new CopyOnWriteArrayList();
      this.id_break[6] = var11;
      this.id_class(
         new Setting[]{
            new rrIc_1("Утилиты", (rrIk_1)this.id_break[0], (rrIk_1)this.id_break[1], (rrIk_1)this.id_break[2]),
            new rrIc_1("После ПВП", (rrIk_1)this.id_break[5], (rrIk_1)this.id_break[4], (rrIk_1)this.id_break[3])
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_byte = new float[]{0.0F, 1.061F, 1.199F, 0.56F, 1.199F};
   }

   @EventTarget
   public void id_class(rrFw_1 var1) {
      if (var1.id_class() == (rrFI)rrFI.staticFields7eee503931553d5586d91adc0f9df349[1]) {
         this.id_while();
      }
   }

   @EventTarget
   public void id_class(rrAR var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[2]).id_class()) {
         rdn_3 var2 = var1.id_class();
         if (rrjQ_2.id_class(var2)) {
            var1.id_class(true);
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1320744056;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((rrIk_1)this.id_break[0]).id_class() && (Boolean)this.id_break[7]) {
            if (!((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
               Integer var8 = (Integer)this.id_break[8] + 1;
               this.id_break[8] = var8;
            }

            if ((Integer)this.id_break[8] > 10) {
               ((cb_3)id_import.id_class[57]).G();
               this.id_new();
            }
         }

         for (rrHa_1 var3 : (List)this.id_break[6]) {
            if (System.currentTimeMillis() - ((Ax_1)id_import.id_class[55]).id_byte > 1000L && ((cb_3)id_import.id_class[57]).id_protected(var3.id_class())) {
               ((List)this.id_break[6]).remove(var3);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrFK var1) {
      this.id_super();
      ((List)this.id_break[6]).clear();
   }

   @EventTarget
   public void id_class(rrAt_1 var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[0]).id_class() && var1.id_class() == (rrAw_1)rrAw_1.staticFieldsfdd9e1cda53536f3a280666af211bfa1[1]) {
         var1.id_class(true);
         Boolean var6 = true;
         this.id_break[7] = var6;
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_super();
      if (var1.id_class() instanceof rvp_3 var2
         && ((rrIk_1)this.id_break[1]).id_class()
         && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]) {
         String var4 = var2.id_protected().id_byte();
         if (var4.equals("ꈁꀀꈂꌁꈂꀁꈃꄀ") || var4.equals("Меню")) {
            var1.id_class(true);
            ((Aq_1)((cb_3)id_import.id_class[57]).id_break[0]).id_break(new rmj_3(var2.id_break()));
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1916942720712137223L;
   }

   @EventTarget
   public void id_class(rrLz_1 var1) {
      this.id_super();
      if (((rrIk_1)this.id_break[0]).id_class() && ((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break) {
         float var2 = rrfj_3.id_class();
         boolean var3 = rrfj_3.id_catch();
         boolean var4 = var2 != 0.0F ? true : id_implements[13];
         float var5 = var3 && var4 ? 1.061F : id_byte[2];
         float var6 = var3 ? 0.56F : id_byte[4];
         var1.id_class(var5);
         var1.id_catch().id_byte = (double)(var2 * var6);
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, -128, 108, -35, -123, 66, -86, 10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new();
   }

   private static void id_goto() {
      id_catch = new byte[]{2, 3, 2, 3, 2, 10, 9, 7, 8};
   }

   private static void id_continue() {
      id_throws = new String[]{
         new String("RW Helper"),
         new String("Утилитарный модуль для\nReallyWorld"),
         new String("Флай на драгоне"),
         new String("Закрытие меню"),
         new String("Не ставить шары"),
         new String("Авто. полёт"),
         new String("Авто. починка"),
         new String("Авто. исцеление"),
         new String("Утилиты"),
         new String("После ПВП"),
         new String("ꈁꀀꈂꌁꈂꀁꈃꄀ"),
         new String("Меню"),
         new String("/fly"),
         new String("/fix all"),
         new String("/heal")
      };
   }

   private static void id_else() {
      id_implements = new boolean[]{
         true, true, true, true, true, true, false, false, true, true, false, true, true, false, true, true, true, true, true, false, false, false, false
      };
   }

   private void id_new() {
      this.id_super();
      Boolean var5 = false;
      this.id_break[7] = var5;
      Integer var6 = 0;
      this.id_break[8] = var6;
   }

   private static void id_return() {
      id_protected = new long[]{1000L};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         this.id_break[7] = false;
         this.id_break[8] = 0;
      }
   }

   private void id_while() {
      this.id_super();
      ((List)this.id_break[6]).clear();
      if (((rrIk_1)this.id_break[3]).id_class()) {
         ((List)this.id_break[6]).add(new rrHa_1("/fly"));
      }

      if (((rrIk_1)this.id_break[4]).id_class()) {
         ((List)this.id_break[6]).add(new rrHa_1("/fix all"));
      }

      if (((rrIk_1)this.id_break[5]).id_class()) {
         ((List)this.id_break[6]).add(new rrHa_1("/heal"));
      }
   }

   private static void id_public() {
      id_private = new short[]{
         4,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         0,
         1,
         2,
         5,
         4,
         3,
         0,
         57,
         18,
         1,
         0,
         1,
         7,
         0,
         0,
         7,
         57,
         18,
         8,
         8,
         8,
         57,
         6,
         55,
         57,
         6,
         1,
         1,
         0,
         57,
         0,
         2,
         6,
         6,
         3,
         6,
         4,
         6,
         5,
         6,
         7,
         8
      };
   }
}
