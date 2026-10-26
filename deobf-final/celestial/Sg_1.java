package celestial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sg_1 implements C_synchronized {
   public static Object[] class_;
   private static byte[] byte_;
   private static long[] protected_;
   public Object[] break_;
   private static boolean[] throws_;
   private static short[] case_;

   private synchronized void byte_(C_else var1) {
      ((Map)this.break_[1]).put(var1, new HashSet());
      Path var2 = ((Path)this.break_[0]).resolve(var1.name().toLowerCase() + ".mp4");
      if (Files.exists(var2)) {
         try (
            FileInputStream var3 = new FileInputStream(var2.toFile());
            BufferedInputStream var4 = new BufferedInputStream(var3);
            DataInputStream var5 = new DataInputStream(var4);
         ) {
            long var6 = var5.readLong();
            if (var6 != protected_[0]) {
               throw new IOException("Bad magic value " + var6);
            }

            long var8 = var5.readLong();

            while (true) {
               long var10000 = var8;
               var8 -= protected_[1];
               if (var10000 <= protected_[2]) {
                  break;
               }

               String var10 = var5.readUTF();
               long var11 = var5.readLong();
               int var13 = var5.readInt();
               int var14 = var5.readInt();
               int var15 = var5.readInt();
               ((Set)((Map)this.break_[case_[4]]).get(var1)).add(new C_while(var10, var1, new rU_2(var13, var14, var15), var11));
            }
         } catch (IOException var22) {
         }
      }
   }

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public Sg_1(Path var1) {
      this.throws_();
      this.break_[0] = var1;
      if (!Files.exists(var1)) {
         try {
            Files.createDirectories(var1);
         } catch (IOException var9) {
         }
      }

      HashMap var8 = new HashMap();
      this.break_[1] = var8;
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1984229837;
   }

   @Override
   public C_this class_(C_else var1) {
      return ((Set)((Map)this.break_[1]).get(var1)).stream().min(Comparator.comparingLong(var0 -> -var0.protected_())).orElse(null);
   }

   @Override
   public Set<C_this> class_() {
      return ((Map)this.break_[1]).values().stream().flatMap(Collection::stream).collect(Collectors.toSet());
   }

   @Override
   public void class_(C_this var1) {
      if (((Set)((Map)this.break_[1]).get(var1.break_())).add(var1)) {
         this.protected_(var1.break_());
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7226979338303218865L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, -7, 55, -61, 77, 90, -60, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(C_this var1) {
      if (((Set)((Map)this.break_[1]).get(var1.break_())).remove(var1)) {
         this.protected_(var1.break_());
      }
   }

   @Override
   public Set<C_this> break_(C_else var1) {
      return Collections.unmodifiableSet((Set<? extends C_this>)((Map)this.break_[1]).get(var1));
   }

   private static void break_() {
      protected_ = new long[]{121977993584L, 1L, 0L, 121977993584L, 121977993584L};
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      case_ = new short[]{0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1};
   }

   private void case_() {
      for (C_else var4 : C_else.values()) {
         this.byte_(var4);
      }
   }

   private synchronized void protected_(C_else var1) {
      Path var2 = ((Path)this.break_[0]).resolve(var1.name().toLowerCase() + ".mp4");

      try (
         FileOutputStream var3 = new FileOutputStream(var2.toFile());
         BufferedOutputStream var4 = new BufferedOutputStream(var3);
         DataOutputStream var5 = new DataOutputStream(var4);
      ) {
         var5.writeLong(protected_[3]);
         var5.writeLong((long)((Set)((Map)this.break_[case_[6]]).get(var1)).size());

         for (C_this var7 : (Set)((Map)this.break_[case_[7]]).get(var1)) {
            var5.writeUTF(var7.byte_());
            var5.writeLong(var7.protected_());
            var5.writeInt(var7.class_().b_());
            var5.writeInt(var7.class_().c_());
            var5.writeInt(var7.class_().d_());
         }
      } catch (IOException var14) {
         var14.printStackTrace();
      }
   }

   private static void protected_() {
      throws_ = new boolean[]{false, false, false, false, true, false};
   }

   private static void private_() {
      Object[] var0 = new Object[]{121977993584L};
      class_ = var0;
   }
}
