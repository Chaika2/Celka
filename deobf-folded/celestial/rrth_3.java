package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrth_3 implements MinecraftAccessor {
   private static String[] strings39e3fc1d50923a0b997a92f976964031;
   private static double[] doubles39e3fc1d50923a0b997a92f976964031;
   private static byte[] bytes39e3fc1d50923a0b997a92f976964031;
   public Object[] fields39e3fc1d50923a0b997a92f976964031;
   private static boolean[] booleans39e3fc1d50923a0b997a92f976964031;
   private static short[] shorts39e3fc1d50923a0b997a92f976964031;
   public static Object[] staticFields39e3fc1d50923a0b997a92f976964031;

   private static void id_byte() {
      doubles39e3fc1d50923a0b997a92f976964031 = new double[]{2.0};
   }

   private rrth_3() {
      this.id_throws();
      CopyOnWriteArrayList var7 = new CopyOnWriteArrayList();
      this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[1]] = var7;
   }

   static {
      ntfClinit();
   }

   public void id_class(Ml_1 var1) {
      if (!((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[4]]).isEmpty()) {
         boolean var2 = ((Qw_1)id_import.id_class[20]).rs != 2 ? true : booleans39e3fc1d50923a0b997a92f976964031[2];
         if (var2) {
            rrnE_2.id_class(2.0);
         }

         for (rrtO_2 var4 : (List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[6]]) {
            if (var4.id_byte()) {
               if (((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[7]]).remove(var4)) {
                  var4.id_break();
               }
            } else {
               var4.id_class(var1, var4.id_extends(), var4.id_super(), var4.id_native(), var4.id_finally());
            }
         }

         if (var2) {
            rrnE_2.id_class(id_const.id_return());
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{97, -66, -84, 40, 5, 82, 32, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrtO_2 var1) {
      ((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[2]]).add(booleans39e3fc1d50923a0b997a92f976964031[0], var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[shorts39e3fc1d50923a0b997a92f976964031[3]]).id_finally().id_class(rrLr_1.id_class(var1));
   }

   public void id_class() {
      if (!((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[8]]).isEmpty()) {
         ((List)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[9]]).clear();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -321334908;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7626456464079833632L;
   }

   public List<rrtO_2> id_break() {
      return (List<rrtO_2>)this.fields39e3fc1d50923a0b997a92f976964031[shorts39e3fc1d50923a0b997a92f976964031[10]];
   }

   private void id_throws() {
      if (this.fields39e3fc1d50923a0b997a92f976964031 == null) {
         this.fields39e3fc1d50923a0b997a92f976964031 = new Object[1];
         Object[] var1 = this.fields39e3fc1d50923a0b997a92f976964031;
      }
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrth_3(), null};
      var0[1] = new rrth_3[]{(rrth_3)var0[0]};
      staticFields39e3fc1d50923a0b997a92f976964031 = var0;
   }

   private static void id_catch() {
      shorts39e3fc1d50923a0b997a92f976964031 = new short[]{1, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0};
   }

   private static void id_case() {
      strings39e3fc1d50923a0b997a92f976964031 = new String[]{new String("INSTANCE")};
   }

   private static void id_implements() {
      booleans39e3fc1d50923a0b997a92f976964031 = new boolean[]{false, true, false, true, false, false, false, true, true};
   }

   private static void id_protected() {
      bytes39e3fc1d50923a0b997a92f976964031 = new byte[]{2, 2};
   }
}
