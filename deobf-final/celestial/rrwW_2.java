package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrwW_2 implements MinecraftAccessor {
   ;
   private static short[] shortsd828d5c982463367b63d6cc3c26fd998;
   private static String[] stringsd828d5c982463367b63d6cc3c26fd998;
   private static boolean[] booleansd828d5c982463367b63d6cc3c26fd998;
   private static byte[] bytesd828d5c982463367b63d6cc3c26fd998;
   public static Object[] staticFieldsd828d5c982463367b63d6cc3c26fd998;
   public Object[] fieldsd828d5c982463367b63d6cc3c26fd998;

   private void byte_() {
      if (this.fieldsd828d5c982463367b63d6cc3c26fd998 == null) {
         this.fieldsd828d5c982463367b63d6cc3c26fd998 = new Object[2];
         Object[] var1 = this.fieldsd828d5c982463367b63d6cc3c26fd998;
      }
   }

   private rrwW_2() {
      this.byte_();
      ArrayList var7 = new ArrayList();
      this.fieldsd828d5c982463367b63d6cc3c26fd998[0] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1140800929400921318L;
   }

   public void class_(C_class var1) {
      rrwk_3[] var10001 = new rrwk_3[1];
      rrwQ_2 var6;
      rrwQ_2 var10004 = var6 = new rrwQ_2(var1);
      this.fieldsd828d5c982463367b63d6cc3c26fd998[1] = var6;
      var10001[0] = var10004;
      this.class_(var10001);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1143621765;
   }

   public void class_(rrwk_3... var1) {
      ((List)this.fieldsd828d5c982463367b63d6cc3c26fd998[0]).addAll(List.of(var1));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -110, 47, -93, -18, 110, -120, 85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_(rrfq_3 var1) {
      if (!import_.finally_() && (rrfq_3)rrfp_3.class_[1] == var1) {
         switch (((int[])rrwz_3.class_[0])[var1.ordinal()]) {
            case 1:
               return ((rrwQ_2)this.fieldsd828d5c982463367b63d6cc3c26fd998[1]).class_();
            default:
               return booleansd828d5c982463367b63d6cc3c26fd998[3];
         }
      } else {
         return booleansd828d5c982463367b63d6cc3c26fd998[2];
      }
   }

   public rrwQ_2 class_() {
      return (rrwQ_2)this.fieldsd828d5c982463367b63d6cc3c26fd998[1];
   }

   public List<rrwk_3> break_() {
      return (List<rrwk_3>)this.fieldsd828d5c982463367b63d6cc3c26fd998[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrwW_2(), null};
      var0[1] = new rrwW_2[]{(rrwW_2)var0[0]};
      staticFieldsd828d5c982463367b63d6cc3c26fd998 = var0;
   }

   private static void catch_() {
      stringsd828d5c982463367b63d6cc3c26fd998 = new String[]{new String("INSTANCE")};
   }

   private static void case_() {
      booleansd828d5c982463367b63d6cc3c26fd998 = new boolean[]{true, false, false, false, true, false, false, false, true};
   }

   private static void protected_() {
      shortsd828d5c982463367b63d6cc3c26fd998 = new short[]{1, 0, 1, 1, 0, 1, 0, 0, 1, 0};
   }

   private static void private_() {
      bytesd828d5c982463367b63d6cc3c26fd998 = new byte[]{2, 2};
   }
}
