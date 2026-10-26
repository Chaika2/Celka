package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrth_3 implements MinecraftAccessor {
   ;
   private static String[] strings39e3fc1d50923a0b997a92f976964031;
   private static double[] doubles39e3fc1d50923a0b997a92f976964031;
   private static byte[] bytes39e3fc1d50923a0b997a92f976964031;
   public Object[] fields39e3fc1d50923a0b997a92f976964031;
   private static boolean[] booleans39e3fc1d50923a0b997a92f976964031;
   private static short[] shorts39e3fc1d50923a0b997a92f976964031;
   public static Object[] staticFields39e3fc1d50923a0b997a92f976964031;

   private static void byte_() {
      doubles39e3fc1d50923a0b997a92f976964031 = new double[]{2.0};
   }

   private rrth_3() {
      this.throws_();
      CopyOnWriteArrayList var7 = new CopyOnWriteArrayList();
      this.fields39e3fc1d50923a0b997a92f976964031[0] = var7;
   }

   static {
      ntfClinit();
   }

   public void class_(Ml_1 var1) {
      if (!((List)this.fields39e3fc1d50923a0b997a92f976964031[0]).isEmpty()) {
         boolean var2 = ((Qw_1)import_.class_[20]).rs != 2 ? true : booleans39e3fc1d50923a0b997a92f976964031[2];
         if (var2) {
            rrnE_2.class_(2.0);
         }

         for (rrtO_2 var4 : (List)this.fields39e3fc1d50923a0b997a92f976964031[0]) {
            if (var4.byte_()) {
               if (((List)this.fields39e3fc1d50923a0b997a92f976964031[0]).remove(var4)) {
                  var4.break_();
               }
            } else {
               var4.class_(var1, var4.extends_(), var4.super_(), var4.native_(), var4.finally_());
            }
         }

         if (var2) {
            rrnE_2.class_(const_.return_());
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{97, -66, -84, 40, 5, 82, 32, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrtO_2 var1) {
      ((List)this.fields39e3fc1d50923a0b997a92f976964031[0]).add(0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLr_1.class_(var1));
   }

   public void class_() {
      if (!((List)this.fields39e3fc1d50923a0b997a92f976964031[0]).isEmpty()) {
         ((List)this.fields39e3fc1d50923a0b997a92f976964031[0]).clear();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -321334908;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7626456464079833632L;
   }

   public List<rrtO_2> break_() {
      return (List<rrtO_2>)this.fields39e3fc1d50923a0b997a92f976964031[0];
   }

   private void throws_() {
      if (this.fields39e3fc1d50923a0b997a92f976964031 == null) {
         this.fields39e3fc1d50923a0b997a92f976964031 = new Object[1];
         Object[] var1 = this.fields39e3fc1d50923a0b997a92f976964031;
      }
   }

   private static void finally_() {
      Object[] var0 = new Object[]{new rrth_3(), null};
      var0[1] = new rrth_3[]{(rrth_3)var0[0]};
      staticFields39e3fc1d50923a0b997a92f976964031 = var0;
   }

   private static void catch_() {
      shorts39e3fc1d50923a0b997a92f976964031 = new short[]{1, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0};
   }

   private static void case_() {
      strings39e3fc1d50923a0b997a92f976964031 = new String[]{new String("INSTANCE")};
   }

   private static void implements_() {
      booleans39e3fc1d50923a0b997a92f976964031 = new boolean[]{false, true, false, true, false, false, false, true, true};
   }

   private static void protected_() {
      bytes39e3fc1d50923a0b997a92f976964031 = new byte[]{2, 2};
   }
}
