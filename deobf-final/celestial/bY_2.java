package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bY_2 implements rr_3 {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;

   @Override
   public boolean byte_() {
      return !((List)this.class_[2]).isEmpty() ? true : byte_[10];
   }

   public bY_2(C_class var1) {
      this.finally_();
      this.class_[0] = var1;
      HashSet var7 = new HashSet();
      this.class_[1] = var7;
      ArrayList var8 = new ArrayList();
      this.class_[2] = var8;
      var1.s().class_(new bo_3(this));
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{59, -124, -104, 88, -35, -18, 59, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(rz_3 var1) {
      var1.protected_();
      ((HashSet)this.class_[1]).add(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1641658602;
   }

   @Override
   public HashSet<rz_3> class_() {
      return (HashSet<rz_3>)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8082973147586416493L;
   }

   public boolean class_(rP_2 var1) {
      Gh_1 var2 = ((C_class)this.class_[0]).while_().new_();
      if (var2 != null) {
         if (var1.break_(var2.class_().protected_())) {
            return false;
         } else {
            return !var1.equals(var2.class_().byte_()) ? true : byte_[2];
         }
      } else {
         return byte_[3];
      }
   }

   public boolean break_(rP_2 var1) {
      Gh_1 var2 = ((C_class)this.class_[0]).while_().new_();
      if (var2 != null) {
         rP_2 var3 = var2.class_().byte_();
         rU_2 var4 = var2.class_().protected_();
         if (var3.break_(var4) && !var1.break_(var4)) {
            return true;
         }
      }

      return byte_[5];
   }

   @Override
   public Optional<rn_3> break_() {
      return Optional.ofNullable((rn_3)this.class_[5]);
   }

   @Override
   public rz_3 throws_() {
      return this.class_().stream().filter(rz_3::byte_).findFirst().orElse(null);
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
      }
   }

   public void catch_() {
      rz_3 var6 = (rz_3)this.class_[4];
      this.class_[3] = var6;
      Object var7 = null;
      this.class_[4] = var7;
      BO var1 = ((C_class)this.class_[0]).while_();
      rn_3 var8 = this.private_();
      this.class_[5] = var8;
      if ((rn_3)this.class_[5] == null) {
         var1.synchronized_();
         var1.class_(null);
      } else {
         if (!Objects.equals((rz_3)this.class_[4], (rz_3)this.class_[3])
            && (rC_2)((rn_3)this.class_[5]).class_[1] != (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]
            && (rz_3)this.class_[3] != null
            && !((rz_3)this.class_[3]).catch_()) {
            var1.synchronized_();
         }

         switch (((int[])bK_2.class_[0])[((rC_2)((rn_3)this.class_[5]).class_[1]).ordinal()]) {
            case 1:
               var1.final_();
               break;
            case 2:
               var1.class_((rP_2)((rn_3)this.class_[5]).class_[0]);
               var1.synchronized_();
               break;
            case 3:
               if (!var1.catch_() && !var1.case_().isPresent()) {
                  var1.class_((rn_3)this.class_[5]);
               }
               break;
            case 4:
               if (!var1.catch_() && !var1.case_().isPresent()) {
                  var1.class_((rn_3)this.class_[5]);
               }
               break;
            case 5:
               if ((rP_2)((rn_3)this.class_[5]).class_[0] != null) {
                  ((C_class)this.class_[0]).while_().class_((rn_3)this.class_[5]);
               }
               break;
            default:
               throw new IllegalStateException();
         }
      }
   }

   private static void extends_() {
      break_ = new short[]{
         0,
         1,
         2,
         1,
         0,
         3,
         4,
         5,
         2,
         1,
         4,
         5,
         4,
         3,
         4,
         0,
         5,
         5,
         4,
         3,
         5,
         1,
         1,
         3,
         3,
         0,
         5,
         1,
         5,
         0,
         5,
         5,
         5,
         0,
         0,
         5,
         5,
         0,
         0,
         5,
         1,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         5,
         0,
         0,
         1,
         2,
         2,
         2,
         2,
         2,
         3,
         0,
         0,
         1,
         5,
         4,
         1,
         2
      };
   }

   public void case_() {
      ((C_class)this.class_[0]).s().native_();
      Object var7 = null;
      this.class_[3] = var7;
      Object var8 = null;
      this.class_[4] = var8;
      Object var9 = null;
      this.class_[5] = var9;
      ((List)this.class_[2]).clear();

      for (rz_3 var2 : (HashSet)this.class_[1]) {
         var2.protected_();
         if (var2.byte_() && !var2.catch_()) {
            throw new IllegalStateException(var2.break_());
         }
      }
   }

   private static void implements_() {
      protected_ = new byte[]{6};
   }

   @Override
   public Optional<rz_3> protected_() {
      return Optional.ofNullable((rz_3)this.class_[4]);
   }

   public rn_3 private_() {
      for (rz_3 var2 : (HashSet)this.class_[1]) {
         if (var2.byte_()) {
            if (!((List)this.class_[2]).contains(var2)) {
               ((List)this.class_[2]).add(0, var2);
            }
         } else {
            ((List)this.class_[2]).remove(var2);
         }
      }

      ((List)this.class_[2]).sort(Comparator.comparingDouble(rz_3::case_).reversed());
      Iterator var9 = ((List)this.class_[2]).iterator();

      while (var9.hasNext()) {
         rz_3 var10 = (rz_3)var9.next();
         rn_3 var3 = var10.class_(
            Objects.equals(var10, (rz_3)this.class_[3]) && ((C_class)this.class_[0]).while_().int_() ? true : byte_[8],
            ((C_class)this.class_[0]).while_().else_()
         );
         if (var3 == null) {
            if (var10.byte_()) {
               throw new IllegalStateException(var10.break_() + " actively returned null PathingCommand");
            }
         } else if ((rC_2)var3.class_[1] != (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[5]) {
            this.class_[4] = var10;
            if (!var10.catch_()) {
               var9.forEachRemaining(rz_3::protected_);
            }

            return var3;
         }
      }

      return null;
   }

   void volatile_() {
      if ((rn_3)this.class_[5] != null) {
         BO var1 = ((C_class)this.class_[0]).while_();
         switch (((int[])bK_2.class_[0])[((rC_2)((rn_3)this.class_[5]).class_[1]).ordinal()]) {
            case 3:
               if ((rP_2)((rn_3)this.class_[5]).class_[0] == null
                  || this.class_((rP_2)((rn_3)this.class_[5]).class_[0])
                  || this.break_((rP_2)((rn_3)this.class_[5]).class_[0])) {
                  var1.this_();
               }

               var1.class_((rn_3)this.class_[5]);
               break;
            case 4:
               if ((Boolean)C_class.instanceof_().Pb.class_[0]
                  && ((rP_2)((rn_3)this.class_[5]).class_[0] == null || this.break_((rP_2)((rn_3)this.class_[5]).class_[0]))) {
                  var1.this_();
               }

               var1.class_((rn_3)this.class_[5]);
         }
      }
   }

   private static void native_() {
      byte_ = new boolean[]{false, true, false, false, true, false, false, true, false, true, false};
   }
}
