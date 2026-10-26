package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrwW_2 implements MinecraftAccessor {
   private static short[] shortsd828d5c982463367b63d6cc3c26fd998;
   private static String[] stringsd828d5c982463367b63d6cc3c26fd998;
   private static boolean[] booleansd828d5c982463367b63d6cc3c26fd998;
   private static byte[] bytesd828d5c982463367b63d6cc3c26fd998;
   public static Object[] staticFieldsd828d5c982463367b63d6cc3c26fd998;
   public Object[] fieldsd828d5c982463367b63d6cc3c26fd998;

   private void id_byte() {
      if (this.fieldsd828d5c982463367b63d6cc3c26fd998 == null) {
         this.fieldsd828d5c982463367b63d6cc3c26fd998 = new Object[2];
         Object[] var1 = this.fieldsd828d5c982463367b63d6cc3c26fd998;
      }
   }

   private rrwW_2() {
      this.id_byte();
      ArrayList var7 = new ArrayList();
      this.fieldsd828d5c982463367b63d6cc3c26fd998[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1140800929400921318L;
   }

   public void id_class(C_class var1) {
      rrwk_3[] var10001 = new rrwk_3[1];
      rrwQ_2 var6;
      rrwQ_2 var10004 = var6 = new rrwQ_2(var1);
      this.fieldsd828d5c982463367b63d6cc3c26fd998[1] = var6;
      var10001[0] = var10004;
      this.id_class(var10001);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1143621765;
   }

   public void id_class(rrwk_3... var1) {
      ((List)this.fieldsd828d5c982463367b63d6cc3c26fd998[0]).addAll(List.of(var1));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -110, 47, -93, -18, 110, -120, 85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class(rrfq_3 var1) {
      if (!id_import.id_finally() && (rrfq_3)rrfp_3.id_class[1] == var1) {
         switch (((int[])rrwz_3.id_class[0])[var1.ordinal()]) {
            case 1:
               return ((rrwQ_2)this.fieldsd828d5c982463367b63d6cc3c26fd998[1]).id_class();
            default:
               return booleansd828d5c982463367b63d6cc3c26fd998[3];
         }
      } else {
         return booleansd828d5c982463367b63d6cc3c26fd998[2];
      }
   }

   public rrwQ_2 id_class() {
      return (rrwQ_2)this.fieldsd828d5c982463367b63d6cc3c26fd998[1];
   }

   public List<rrwk_3> id_break() {
      return (List<rrwk_3>)this.fieldsd828d5c982463367b63d6cc3c26fd998[0];
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrwW_2(), null};
      var0[1] = new rrwW_2[]{(rrwW_2)var0[0]};
      staticFieldsd828d5c982463367b63d6cc3c26fd998 = var0;
   }

   private static void id_catch() {
      stringsd828d5c982463367b63d6cc3c26fd998 = new String[]{new String("INSTANCE")};
   }

   private static void id_case() {
      booleansd828d5c982463367b63d6cc3c26fd998 = new boolean[]{true, false, false, false, true, false, false, false, true};
   }

   private static void id_protected() {
      shortsd828d5c982463367b63d6cc3c26fd998 = new short[]{1, 0, 1, 1, 0, 1, 0, 0, 1, 0};
   }

   private static void id_private() {
      bytesd828d5c982463367b63d6cc3c26fd998 = new byte[]{2, 2};
   }
}
