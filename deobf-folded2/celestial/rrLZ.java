package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLZ extends Om_1 implements MinecraftAccessor {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   public static Object[] id_break;
   private static float[] id_throws;
   private static short[] id_case;

   public rrLZ() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static rrLZ id_class(ruS_2<?> var0) {
      ((rrLZ)id_break[0]).id_class[0] = var0;
      ((rrLZ)id_break[0]).id_class(false);
      return (rrLZ)id_break[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -626080869;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, -91, 57, 110, -26, 120, -17, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public ruS_2<?> id_class() {
      this.id_protected();
      return (ruS_2<?>)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2158105780922762881L;
   }

   public static void id_class(rrLZ var0, ruS_2<?> var1) {
      if (var1 instanceof rZO var2) {
         if (var2 instanceof rZJ || var2 instanceof rZX) {
            PX var7 = (PX)PJ.id_class[0];
            var7.id_class(var2.id_class(0.0F));
            var7.id_byte(var2.id_break(0.0F));
         }
      } else if (var1 instanceof rmT_2) {
         ((Ax_1)id_import.id_class[55]).id_byte = System.currentTimeMillis();
      } else if (var1 instanceof rZb_1 var3) {
         if (var3.id_protected() == rZM.SWAP_ITEM_WITH_OFFHAND) {
            ((Ax_1)id_import.id_class[55]).id_protected = System.currentTimeMillis();
         }
      } else if (var1 instanceof rmD_2 var4) {
         if (var4.id_break() == rmU_2.START_FALL_FLYING) {
            ((Ax_1)id_import.id_class[55]).id_case = System.currentTimeMillis();
         }
      } else if (var1 instanceof rmI_2 var5) {
         if (var5.id_break() == rmf_3.PERFORM_RESPAWN) {
            rrAc_1 var8 = rrAc_1.id_break();
            if (var8.id_byte()) {
               var0.id_class(true);
            }
         }
      } else if (var1 instanceof rmt_3 var6) {
         rrNV var9 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).id_throws().id_switch();
         if (var9 != null && var6.id_byte() == 49) {
            rrFe_1.id_class(var9, (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[0]);
         }
      }
   }

   private static void id_break() {
      id_byte = new byte[]{49};
   }

   private static void id_throws() {
      id_case = new short[]{0, 0, 0, 0, 0, 55, 55, 55, 0, 0, 0};
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, true, false, true, true};
   }

   private static void id_case() {
      Object[] var0 = new Object[]{new rrLZ()};
      id_break = var0;
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_throws = new float[2];
   }
}
