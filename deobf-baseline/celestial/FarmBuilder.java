package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FarmBuilder extends Module {
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static String[] id_throws;
   private static byte[] id_catch;
   public Object[] id_break;

   public boolean id_byte(String var1) {
      this.id_goto();
      bW_2 var2 = C_throws.id_byte().id_abstract();
      String var3 = rrfu_3.id_class((Module)this);
      if ((rY_2)this.id_break[id_byte[4]] == null) {
         String var10001 = id_throws[7];
         Object[] var10002 = new Object[id_protected[3]];
         var10002[id_protected[4]] = C_throws.id_break().id_protected.id_class[id_byte[5]];
         String var6 = var3 + var10001.formatted(var10002);
         rrfu_3.id_byte(var6);
         return id_protected[5];
      } else {
         bc_3 var4 = this.id_protected(var1);
         if (var4 == null) {
            String var5 = var3 + "Неверный режим: " + ((rrIQ)this.id_break[id_byte[6]]).id_byte();
            rrfu_3.id_byte(var5);
            return id_protected[6];
         } else {
            var2.id_class(var4, (rY_2)this.id_break[id_byte[7]]);
            return id_protected[7];
         }
      }
   }

   public FarmBuilder() {
      super(id_throws[0], id_throws[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_byte[0]]);
      this.id_goto();
      String var10003 = id_throws[2];
      String var10004 = id_throws[3];
      String[] var10005 = new String[id_catch[0]];
      var10005[id_protected[0]] = id_throws[4];
      var10005[id_protected[1]] = id_throws[5];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005).id_class(id_throws[6], (var1, var2) -> {
         if (this.aJ_()) {
            String var3 = var1.id_byte();
            if (!this.id_byte(var3)) {
               this.id_byte(id_protected[10]);
            }
         }
      });
      this.id_break[id_byte[1]] = var5;
      this.id_class((rrIQ)this.id_break[id_byte[2]]);
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      this.id_super().id_protected();
   }

   public void id_class(rY_2 var1) {
      this.id_goto();
      this.id_break[id_byte[11]] = var1;
   }

   @Override
   public void id_class(boolean var1) {
      this.id_goto();
      if (!this.id_byte(((rrIQ)this.id_break[id_byte[3]]).id_byte())) {
         this.id_byte(id_protected[2]);
      } else {
         super.id_class(var1);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2064511098753329296L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -984812413;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, 57, 98, 1, -2, 85, 93, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_this();
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
      }
   }

   private static void id_continue() {
      id_byte = new short[]{4, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1};
   }

   private static void id_else() {
      id_catch = new byte[]{2, -1, 2};
   }

   public rY_2 id_new() {
      this.id_goto();
      return (rY_2)this.id_break[id_byte[10]];
   }

   private static void id_return() {
      id_protected = new boolean[]{false, true, true, true, false, false, false, true, false, true, true};
   }

   private bW_2 id_super() {
      return C_throws.id_byte().id_abstract();
   }

   private static void id_public() {
      id_throws = new String[]{
         new String("Farm Builder"),
         new String("Помогает в постройке фермы\nкриперов"),
         new String("Режим"),
         new String("Люки"),
         new String("Люки"),
         new String("Полублоки"),
         new String("onChangeMode"),
         new String("Необходимо установить область фермы криперов. Используйте команду %sfb"),
         new String("Люки"),
         new String("Полублоки")
      };
   }

   private bc_3 id_protected(String var1) {
      byte var3 = id_catch[1];
      switch (var1.hashCode()) {
         case 192075:
            if (var1.equals(id_throws[9])) {
               var3 = id_protected[9];
            }
            break;
         case 32403985:
            if (var1.equals(id_throws[8])) {
               var3 = id_protected[8];
            }
      }
      return switch (var3) {
         case 0 -> (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_byte[8]];
         case 1 -> (bc_3)bc_3.staticFields88c6ec79f799365a8a83966a191f4fa4[id_byte[9]];
         default -> null;
      };
   }
}
