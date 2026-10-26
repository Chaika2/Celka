package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfg_3 implements MinecraftAccessor {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[1] = false;
         this.id_class[2] = false;
         this.id_class[3] = false;
         this.id_class[4] = false;
         this.id_class[5] = false;
      }
   }

   public rrfg_3() {
      this.id_byte();
      rrfw_3 var5 = new rrfw_3();
      this.id_class[id_break[0]] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean id_class(float var1) {
      if ((Boolean)this.id_class[1]) {
         if (((rrfw_3)this.id_class[id_break[14]]).id_class((double)var1)) {
            Boolean var6 = id_byte[5];
            this.id_class[1] = var6;
            ((rrfw_3)this.id_class[id_break[16]]).id_class();
            return true;
         }
      } else {
         ((rrfw_3)this.id_class[id_break[17]]).id_class();
      }

      return id_byte[7];
   }

   public void id_class(rrLu_1 var1) {
      if ((cb_3)id_import.id_class[57] != null) {
         if (!this.id_case()) {
            if (var1.id_class() instanceof rvu_3) {
               Boolean var9 = true;
               this.id_class[3] = var9;
            }

            boolean var2 = !this.id_class[2] && !this.id_class[4] && !this.id_class[3] && !this.id_class[5] ? id_byte[2] : true;
            if (!var2) {
               if (var1.id_class() instanceof rvQ_2 var3 && var3.id_break() == 2 && var3.id_class((gm_3)id_import.id_class[56]) == (cb_3)id_import.id_class[57]
                  )
                {
                  Boolean var10 = true;
                  this.id_class[1] = var10;
               }
            } else if ((Integer)((cb_3)id_import.id_class[57]).id_private[10] > 0) {
               Boolean var11 = id_byte[4];
               this.id_class[1] = var11;
               this.id_protected();
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2030844275078529391L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, -68, -111, 31, 30, -25, 48, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1506344688;
   }

   public void id_class(rrnh_3 var1) {
      switch (((int[])rrfR_2.id_class[id_break[18]])[var1.id_class().ordinal()]) {
         case 1:
            Boolean var6 = true;
            this.id_class[2] = var6;
            break;
         case 2:
            Boolean var7 = true;
            this.id_class[4] = var7;
            break;
         case 3:
            Boolean var8 = true;
            this.id_class[5] = var8;
      }

      Boolean var9 = id_byte[11];
      this.id_class[1] = var9;
   }

   public boolean id_class() {
      return (Boolean)this.id_class[1];
   }

   public void id_break() {
      Boolean var5 = id_byte[12];
      this.id_class[1] = var5;
      this.id_protected();
      ((rrfw_3)this.id_class[id_break[24]]).id_class();
   }

   private static void id_throws() {
      id_protected = new byte[]{2, 6, 2, 3, 4, 5};
   }

   private static void id_catch() {
      id_break = new short[]{0, 57, 3, 2, 4, 3, 5, 56, 57, 1, 57, 10, 1, 1, 0, 1, 0, 0, 0, 2, 4, 5, 1, 1, 0, 2, 3, 4, 5, 57, 57, 57, 1};
   }

   private boolean id_case() {
      return !((cb_3)id_import.id_class[57]).id_break(rLD.id_super)
            && !((cb_3)id_import.id_class[57]).id_break(rLD.id_this)
            && !((cb_3)id_import.id_class[57]).id_break(rLD.id_catch)
         ? id_byte[18]
         : true;
   }

   private void id_protected() {
      Boolean var5 = id_byte[13];
      this.id_class[2] = var5;
      Boolean var6 = id_byte[14];
      this.id_class[3] = var6;
      Boolean var7 = id_byte[15];
      this.id_class[4] = var7;
      Boolean var8 = id_byte[16];
      this.id_class[5] = var8;
   }

   private static void id_private() {
      id_byte = new boolean[]{
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }
}
