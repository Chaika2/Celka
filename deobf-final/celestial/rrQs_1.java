package celestial;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.ProviderMismatchException;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQs_1 implements Path {
   private static String[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   public static Object[] class_;
   public Object[] break_;
   private static boolean[] case_;

   private void byte_(rrQs_1 var1, CopyOption... var2) throws IOException {
      boolean var3 = false;
      boolean var4 = false;

      for (CopyOption var8 : var2) {
         if (var8 == StandardCopyOption.REPLACE_EXISTING) {
            var3 = true;
         } else if (var8 == StandardCopyOption.COPY_ATTRIBUTES) {
            var4 = true;
         }
      }

      rrzt_3 var18 = this.class_();
      boolean var19;
      if (var3) {
         try {
            var1.continue_();
            var19 = case_[159];
         } catch (DirectoryNotEmptyException var15) {
            var19 = true;
         }
      } else {
         var19 = var1.final_();
      }

      if (var19) {
         throw new FileAlreadyExistsException(var1.toString());
      } else {
         if (var18.isDirectory()) {
            var1.class_();
         } else {
            try (
               InputStream var20 = ((rrzf_3)this.break_[0]).byte_(this.throws_());
               OutputStream var22 = var1.class_();
            ) {
               var20.transferTo(var22);
            }
         }

         if (var4) {
            rrzq_3 var21 = var1.break_(rrzq_3.class);

            try {
               var21.setTimes(var18.lastModifiedTime(), var18.lastAccessTime(), var18.creationTime());
               var21.setPermissions(var18.class_().orElse(null));
            } catch (IOException var14) {
               try {
                  var1.byte_();
               } catch (IOException var11) {
               }

               throw var14;
            }
         }
      }
   }

   public void byte_() throws IOException {
      ((rrzf_3)this.break_[0]).class_(this.throws_(), true);
   }

   private static String byte_(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1 = var0.length();
         if (var1 == 0) {
            return var0;
         } else if (var0.indexOf(37) < 0) {
            return var0;
         } else {
            StringBuilder var2 = new StringBuilder(var1);
            byte[] var3 = new byte[var1];
            boolean var4 = false;
            int var5 = 0;

            while (var5 < var1) {
               char var6 = var0.charAt(var5);
               if (var6 == '[') {
                  var4 = true;
               } else if (var4 && var6 == ']') {
                  var4 = false;
               }

               if (var6 == '%' && !var4) {
                  int var7;
                  for (var7 = case_[167]; var6 == '%'; var6 = var0.charAt(var5)) {
                     if (!(Boolean)class_[0] && var1 - var5 < 2) {
                        throw new AssertionError();
                     }

                     var3[var7++] = (byte)((class_(var0.charAt(++var5)) & 15) << 4 | class_(var0.charAt(++var5)) & 15);
                     if (++var5 >= var1) {
                        break;
                     }
                  }

                  var2.append(new String(var3, 0, var7, StandardCharsets.UTF_8));
               } else {
                  var2.append(var6);
                  var5++;
               }
            }

            return var2.toString();
         }
      }
   }

   private rrQs_1 byte_(Path var1) {
      Objects.requireNonNull(var1, "path");
      if (!(var1 instanceof rrQs_1)) {
         throw new ProviderMismatchException();
      } else {
         return (rrQs_1)var1;
      }
   }

   private void int_() {
      if ((int[])this.break_[2] == null) {
         int var1 = 0;
         int var2 = 0;
         if (((byte[])this.break_[1]).length == 0) {
            var1 = 1;
         } else {
            while (var2 < ((byte[])this.break_[1]).length) {
               byte var3 = ((byte[])this.break_[1])[var2++];
               if (var3 != 47) {
                  var1++;

                  while (var2 < ((byte[])this.break_[1]).length && ((byte[])this.break_[1])[var2] != 47) {
                     var2++;
                  }
               }
            }
         }

         int[] var14 = new int[var1];
         var1 = 0;
         var2 = 0;

         while (var2 < ((byte[])this.break_[1]).length) {
            byte var4 = ((byte[])this.break_[1])[var2];
            if (var4 == 47) {
               var2++;
            } else {
               var14[var1++] = var2++;

               while (var2 < ((byte[])this.break_[1]).length && ((byte[])this.break_[1])[var2] != 47) {
                  var2++;
               }
            }
         }

         synchronized (this) {
            if ((int[])this.break_[protected_[116]] == null) {
               this.break_[protected_[117]] = var14;
            }
         }
      }
   }

   public rrQs_1(rrzf_3 var1, byte[] var2) {
      this(var1, var2, false);
   }

   public rrQs_1(rrzf_3 var1, String var2) {
      this.super_();
      Integer var7 = 0;
      this.break_[3] = var7;
      Object var8 = null;
      this.break_[4] = var8;
      this.break_[0] = var1;
      byte[] var10 = this.throws_(var2);
      this.break_[1] = var10;
   }

   public rrQs_1(rrzf_3 var1, byte[] var2, boolean var3) {
      this.super_();
      Integer var8 = 0;
      this.break_[3] = var8;
      Object var9 = null;
      this.break_[4] = var9;
      this.break_[0] = var1;
      if (var3) {
         this.break_[1] = var2;
      } else if (((rrzC_2)var1.break_[2]).class_()) {
         byte[] var12 = this.break_(var2);
         this.break_[1] = var12;
      } else {
         byte[] var13 = this.throws_(var1.throws_(var2));
         this.break_[1] = var13;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof rrQs_1 && (rrzf_3)this.break_[0] == (rrzf_3)((rrQs_1)var1).break_[0] && this.compareTo((Path)var1) == 0 ? true : case_[125];
   }

   @Override
   public String toString() {
      return ((rrzf_3)this.break_[0]).throws_((byte[])this.break_[1]);
   }

   @Override
   public int hashCode() {
      int var1 = (Integer)this.break_[3];
      if (var1 == 0) {
         Integer var6 = var1 = Arrays.hashCode((byte[])this.break_[1]);
         this.break_[3] = var6;
      }

      return var1;
   }

   @Override
   public int compareTo(Path var1) {
      rrQs_1 var2 = this.byte_(var1);
      int var3 = ((byte[])this.break_[1]).length;
      int var4 = ((byte[])var2.break_[1]).length;
      int var5 = Math.min(var3, var4);

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = ((byte[])this.break_[1])[var6] & 255;
         int var8 = ((byte[])var2.break_[1])[var6] & 255;
         if (var7 != var8) {
            return var7 - var8;
         }
      }

      return var3 - var4;
   }

   private static void this_() {
      throws_ = new byte[]{
         47,
         47,
         47,
         47,
         47,
         47,
         3,
         46,
         46,
         47,
         47,
         47,
         47,
         47,
         47,
         47,
         47,
         -1,
         -1,
         47,
         -1,
         47,
         47,
         47,
         47,
         47,
         47,
         92,
         47,
         47,
         47,
         92,
         47,
         47,
         47,
         47,
         92,
         47,
         47,
         47,
         92,
         47,
         47,
         47,
         47,
         46,
         47,
         -1,
         46,
         47,
         47,
         2,
         46,
         46,
         47,
         47,
         47,
         47,
         47,
         47,
         47,
         47,
         58,
         -1,
         58,
         -1,
         3,
         2,
         48,
         57,
         48,
         97,
         102,
         97,
         10,
         65,
         70,
         65,
         10,
         -1,
         37,
         91,
         93,
         37,
         37,
         2,
         15,
         4,
         15,
         5,
         3
      };
   }

   @Override
   public boolean startsWith(String var1) {
      return this.startsWith(((rrzf_3)this.break_[0]).class_(var1));
   }

   @Override
   public boolean startsWith(Path var1) {
      Objects.requireNonNull(var1, "other");
      if (!(var1 instanceof rrQs_1 var2)) {
         return false;
      } else if (var2.isAbsolute() == this.isAbsolute() && ((byte[])var2.break_[1]).length <= ((byte[])this.break_[1]).length) {
         int var3 = ((byte[])var2.break_[1]).length;

         for (int var4 = 0; var4 < var3; var4++) {
            if (((byte[])var2.break_[1])[var4] != ((byte[])this.break_[1])[var4]) {
               return false;
            }
         }

         var3--;
         return ((byte[])var2.break_[1]).length != ((byte[])this.break_[1]).length
               && ((byte[])var2.break_[1])[var3] != 47
               && ((byte[])this.break_[1])[var3 + 1] != 47
            ? case_[65]
            : case_[64];
      } else {
         return case_[60];
      }
   }

   @Override
   public Iterator<Path> iterator() {
      return new rrQE(this);
   }

   @Override
   public boolean endsWith(Path var1) {
      Objects.requireNonNull(var1, "other");
      if (!(var1 instanceof rrQs_1 var2)) {
         return false;
      } else {
         int var3 = ((byte[])var2.break_[1]).length - 1;
         if (var3 > 0 && ((byte[])var2.break_[1])[var3] == 47) {
            var3--;
         }

         int var4 = ((byte[])this.break_[1]).length - 1;
         if (var4 > 0 && ((byte[])this.break_[1])[var4] == 47) {
            var4--;
         }

         if (var3 == -1) {
            return var4 == -1 ? true : case_[70];
         } else if ((!var2.isAbsolute() || this.isAbsolute() && var3 == var4) && var4 >= var3) {
            while (var3 >= 0) {
               if (((byte[])var2.break_[1])[var3] != ((byte[])this.break_[1])[var4]) {
                  return false;
               }

               var3--;
               var4--;
            }

            return ((byte[])var2.break_[1])[var3 + 1] != 47 && var4 != -1 && ((byte[])this.break_[1])[var4] != 47 ? case_[75] : case_[74];
         } else {
            return case_[71];
         }
      }
   }

   @Override
   public boolean endsWith(String var1) {
      return this.endsWith(((rrzf_3)this.break_[0]).class_(var1));
   }

   public void class_(Set<PosixFilePermission> var1) throws IOException {
      ((rrzf_3)this.break_[0]).class_(this.throws_(), var1);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, 102, -6, -50, 24, 63, -91, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(UserPrincipal var1) throws IOException {
      ((rrzf_3)this.break_[0]).class_(this.throws_(), var1);
   }

   private byte[] class_(String var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder(var3);
      var4.append(var1, 0, var2);
      char var5 = 0;

      while (var2 < var3) {
         char var6 = var1.charAt(var2++);
         if (var6 == '\\') {
            var6 = '/';
         }

         if (var6 != '/' || var5 != '/') {
            if (var6 == 0) {
               throw new InvalidPathException(var1, "Path: nul character not allowed");
            }

            var4.append(var6);
            var5 = var6;
         }
      }

      var3 = var4.length();
      if (var3 > 1 && var5 == '/') {
         var4.delete(var3 - 1, var3);
      }

      return ((rrzf_3)this.break_[0]).class_(var4.toString());
   }

   public void class_(FileAttribute<?>... var1) throws IOException {
      ((rrzf_3)this.break_[0]).class_(this.throws_(), var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2865024496306738926L;
   }

   public OutputStream class_(OpenOption... var1) throws IOException {
      return var1.length == 0
         ? ((rrzf_3)this.break_[0]).class_(this.throws_(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)
         : ((rrzf_3)this.break_[0]).class_(this.throws_(), var1);
   }

   public void class_(String var1, Object var2, LinkOption... var3) throws IOException {
      int var6 = var1.indexOf(58);
      String var4;
      String var5;
      if (var6 == -1) {
         var4 = "basic";
         var5 = var1;
      } else {
         var4 = var1.substring(0, var6++);
         var5 = var1.substring(var6);
      }

      this.protected_(var4).class_(var5, var2);
   }

   public SeekableByteChannel class_(Set<? extends OpenOption> var1, FileAttribute<?>... var2) throws IOException {
      return ((rrzf_3)this.break_[0]).break_(this.throws_(), var1, var2);
   }

   private byte[] class_(byte[] var1, int var2) {
      byte[] var3 = new byte[var1.length];

      int var4;
      for (var4 = 0; var4 < var2; var4++) {
         var3[var4] = var1[var4];
      }

      int var5 = var4;
      byte var6 = 0;

      while (var4 < var1.length) {
         byte var7 = var1[var4++];
         if (var7 == 92) {
            var7 = 47;
         }

         if (var7 != 47 || var6 != 47) {
            if (var7 == 0) {
               throw new InvalidPathException(((rrzf_3)this.break_[0]).throws_(var1), "Path: nul character not allowed");
            }

            var3[var5++] = var7;
            var6 = var7;
         }
      }

      if (var5 > 1 && var3[var5 - 1] == 47) {
         var5--;
      }

      return var5 == var3.length ? var3 : Arrays.copyOf(var3, var5);
   }

   public rrQs_1 class_(Path var1) {
      rrQs_1 var2 = this.byte_(var1);
      if (((byte[])var2.break_[1]).length == 0) {
         return this;
      } else {
         return !var2.isAbsolute() && ((byte[])this.break_[1]).length != 0 ? this.class_((byte[])var2.break_[1]) : var2;
      }
   }

   public rrQs_1 class_(LinkOption... var1) throws IOException {
      byte[] var3 = this.throws_();
      rrQs_1 var2;
      if (var3 == (byte[])this.break_[1]) {
         var2 = this;
      } else {
         var2 = new rrQs_1((rrzf_3)this.break_[0], var3, true);
         var2.break_[4] = var3;
      }

      var2.class_();
      return var2;
   }

   private static int class_(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else if (var0 >= 'A' && var0 <= 'F') {
         return var0 - 65 + 10;
      } else if (!(Boolean)class_[0]) {
         throw new AssertionError();
      } else {
         return throws_[79];
      }
   }

   public rrQs_1 class_(int var1) {
      this.int_();
      if (var1 >= 0 && var1 < ((int[])this.break_[2]).length) {
         int var2 = ((int[])this.break_[2])[var1];
         int var3;
         if (var1 == ((int[])this.break_[2]).length - 1) {
            var3 = ((byte[])this.break_[1]).length - var2;
         } else {
            var3 = ((int[])this.break_[2])[var1 + 1] - var2 - 1;
         }

         byte[] var4 = new byte[var3];
         System.arraycopy((byte[])this.break_[1], var2, var4, 0, var3);
         return new rrQs_1((rrzf_3)this.break_[0], var4);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void class_(AccessMode... var1) throws IOException {
      boolean var2 = false;
      boolean var3 = false;

      for (AccessMode var7 : var1) {
         switch (((int[])rrQG.class_[0])[var7.ordinal()]) {
            case 1:
               break;
            case 2:
               var2 = case_[148];
               break;
            case 3:
               var3 = case_[149];
               break;
            default:
               throw new UnsupportedOperationException();
         }
      }

      ((rrzf_3)this.break_[0]).class_(this.throws_());
      if (var2 && ((rrzf_3)this.break_[0]).isReadOnly() || var3) {
         throw new AccessDeniedException(this.toString());
      }
   }

   public Map<String, Object> class_(String var1, LinkOption... var2) throws IOException {
      int var5 = var1.indexOf(58);
      String var3;
      String var4;
      if (var5 == -1) {
         var3 = "basic";
         var4 = var1;
      } else {
         var3 = var1.substring(0, var5++);
         var4 = var1.substring(var5);
      }

      return this.protected_(var3).break_(var4);
   }

   public rrQs_1 class_(int var1, int var2) {
      this.int_();
      if (var1 >= 0 && var1 < ((int[])this.break_[2]).length && var2 <= ((int[])this.break_[2]).length && var1 < var2) {
         int var3 = ((int[])this.break_[2])[var1];
         int var4;
         if (var2 == ((int[])this.break_[2]).length) {
            var4 = ((byte[])this.break_[1]).length - var3;
         } else {
            var4 = ((int[])this.break_[2])[var2] - var3 - 1;
         }

         byte[] var5 = new byte[var4];
         System.arraycopy((byte[])this.break_[1], var3, var5, 0, var4);
         return new rrQs_1((rrzf_3)this.break_[0], var5);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void class_(rrQs_1 var1, CopyOption... var2) throws IOException {
      if (Files.isSameFile(((rrzf_3)this.break_[0]).break_(), ((rrzf_3)var1.break_[0]).break_())) {
         ((rrzf_3)this.break_[0]).class_(true, this.throws_(), var1.throws_(), var2);
      } else {
         this.byte_(var1, var2);
         this.byte_();
      }
   }

   public rrzt_3 class_() throws IOException {
      rrzt_3 var1 = ((rrzf_3)this.break_[0]).break_(this.throws_());
      if (var1 == null) {
         throw new NoSuchFileException(this.toString());
      } else {
         return var1;
      }
   }

   public DirectoryStream<Path> class_(Filter<? super Path> var1) throws IOException {
      return new rrzy_3(this, var1);
   }

   private boolean class_(rrQs_1 var1, int var2) {
      int var3 = ((int[])this.break_[2])[var2];
      int var4;
      if (var2 == ((int[])this.break_[2]).length - 1) {
         var4 = ((byte[])this.break_[1]).length - var3;
      } else {
         var4 = ((int[])this.break_[2])[var2 + 1] - var3 - 1;
      }

      int var5 = ((int[])var1.break_[2])[var2];
      int var6;
      if (var2 == ((int[])var1.break_[2]).length - 1) {
         var6 = ((byte[])var1.break_[1]).length - var5;
      } else {
         var6 = ((int[])var1.break_[2])[var2 + 1] - var5 - 1;
      }

      if (var4 != var6) {
         return false;
      } else {
         for (int var7 = case_[33]; var7 < var4; var7++) {
            if (((byte[])this.break_[1])[var3 + var7] != ((byte[])var1.break_[1])[var5 + var7]) {
               return false;
            }
         }

         return case_[35];
      }
   }

   public <A extends BasicFileAttributes> A class_(Class<A> var1) throws IOException {
      if (var1 == BasicFileAttributes.class || var1 == rrzt_3.class) {
         return (A)this.class_();
      } else if (var1 == PosixFileAttributes.class && (Boolean)((rrzf_3)this.break_[0]).break_[12]) {
         return (A)this.class_();
      } else {
         throw new UnsupportedOperationException("Attributes of type " + var1.getName() + " not supported");
      }
   }

   public void class_(GroupPrincipal var1) throws IOException {
      ((rrzf_3)this.break_[0]).class_(this.throws_(), var1);
   }

   private rrQs_1 class_(byte[] var1) {
      byte[] var3 = (byte[])this.break_[1];
      int var4 = var3.length;
      int var5 = var1.length;
      byte[] var2;
      if (((byte[])this.break_[1])[var4 - 1] == 47) {
         var2 = new byte[var4 + var5];
         System.arraycopy(var3, 0, var2, 0, var4);
         System.arraycopy(var1, 0, var2, var4, var5);
      } else {
         var2 = new byte[var4 + 1 + var5];
         System.arraycopy(var3, 0, var2, 0, var4);
         var2[var4] = 47;
         System.arraycopy(var1, 0, var2, var4 + 1, var5);
      }

      return new rrQs_1((rrzf_3)this.break_[0], var2, true);
   }

   public void class_(FileTime var1, FileTime var2, FileTime var3) throws IOException {
      ((rrzf_3)this.break_[0]).class_(this.throws_(), var1, var2, var3);
   }

   @Override
   public WatchKey register(WatchService var1, Kind<?>... var2) {
      return this.register(var1, var2);
   }

   @Override
   public WatchKey register(WatchService var1, Kind<?>[] var2, Modifier... var3) {
      if (var1 != null && var2 != null && var3 != null) {
         throw new ProviderMismatchException();
      } else {
         throw new NullPointerException();
      }
   }

   @Override
   public boolean isAbsolute() {
      return ((byte[])this.break_[1]).length > 0 && ((byte[])this.break_[1])[0] == 47 ? true : case_[48];
   }

   @Override
   public File toFile() {
      throw new UnsupportedOperationException();
   }

   private byte[] break_(byte[] var1) {
      int var2 = var1.length;
      if (var2 == 0) {
         return var1;
      } else {
         byte var3 = case_[87];

         for (int var4 = 0; var4 < var2; var4++) {
            byte var5 = var1[var4];
            if (var5 == 92 || var5 == 0) {
               return this.class_(var1, var4);
            }

            if (var5 == 47 && var3 == 47) {
               return this.class_(var1, var4 - 1);
            }

            var3 = var5;
         }

         return var2 > 1 && var3 == 47 ? Arrays.copyOf(var1, var2 - 1) : var1;
      }
   }

   public <V extends FileAttributeView> V break_(Class<V> var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (var1 == BasicFileAttributeView.class) {
         return (V)(new rrzq_3(this, false));
      } else if (var1 == rrzq_3.class) {
         return (V)(new rrzq_3(this, true));
      } else {
         if ((Boolean)((rrzf_3)this.break_[0]).break_[12]) {
            if (var1 == PosixFileAttributeView.class) {
               return (V)(new rrQb_1(this, false));
            }

            if (var1 == FileOwnerAttributeView.class) {
               return (V)(new rrQb_1(this, true));
            }
         }

         return null;
      }
   }

   public rrQs_1 break_() {
      if (this.isAbsolute()) {
         return this;
      } else {
         byte[] var1 = new byte[((byte[])this.break_[1]).length + 1];
         System.arraycopy((byte[])this.break_[1], 0, var1, 1, ((byte[])this.break_[1]).length);
         var1[0] = 47;
         return new rrQs_1((rrzf_3)this.break_[0], var1, true);
      }
   }

   public boolean break_(Path var1) throws IOException {
      if (this.equals(var1)) {
         return true;
      } else if (var1 != null && this.private_() == var1.getFileSystem()) {
         this.class_();
         ((rrQs_1)var1).class_();
         return Arrays.equals(this.throws_(), ((rrQs_1)var1).throws_());
      } else {
         return case_[142];
      }
   }

   public rrQs_1 break_(String var1) {
      byte[] var2 = this.throws_(var1);
      if (var2.length == 0) {
         return this;
      } else {
         return var2[0] != 47 && ((byte[])this.break_[1]).length != 0 ? this.class_(var2) : new rrQs_1((rrzf_3)this.break_[0], var2, true);
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -745263386;
   }

   public void break_(rrQs_1 var1, CopyOption... var2) throws IOException {
      if (Files.isSameFile(((rrzf_3)this.break_[0]).break_(), ((rrzf_3)var1.break_[0]).break_())) {
         ((rrzf_3)this.break_[0]).class_(false, this.throws_(), var1.throws_(), var2);
      } else {
         this.byte_(var1, var2);
      }
   }

   public InputStream break_(OpenOption... var1) throws IOException {
      if (var1.length > 0) {
         for (OpenOption var5 : var1) {
            if (var5 != StandardOpenOption.READ) {
               throw new UnsupportedOperationException("'" + var5 + "' not allowed");
            }
         }
      }

      return ((rrzf_3)this.break_[0]).byte_(this.throws_());
   }

   public FileChannel break_(Set<? extends OpenOption> var1, FileAttribute<?>... var2) throws IOException {
      return ((rrzf_3)this.break_[0]).class_(this.throws_(), var1, var2);
   }

   private byte[] throws_(String var1) {
      if (((rrzC_2)((rrzf_3)this.break_[0]).break_[2]).class_()) {
         return this.break_(((rrzf_3)this.break_[0]).class_(var1));
      } else {
         int var2 = var1.length();
         if (var2 == 0) {
            return new byte[0];
         } else {
            char var3 = case_[97];

            for (int var4 = 0; var4 < var2; var4++) {
               char var5 = var1.charAt(var4);
               if (var5 == '\\' || var5 == 0) {
                  return this.class_(var1, var4, var2);
               }

               if (var5 == '/' && var3 == '/') {
                  return this.class_(var1, var4 - 1, var2);
               }

               var3 = var5;
            }

            if (var2 > 1 && var3 == '/') {
               var1 = var1.substring(0, var2 - 1);
            }

            return ((rrzf_3)this.break_[0]).class_(var1);
         }
      }
   }

   public byte[] throws_() {
      byte[] var1 = (byte[])this.break_[4];
      if (var1 == null) {
         if (this.isAbsolute()) {
            var1 = this.extends_();
         } else {
            var1 = this.break_().throws_();
         }

         this.break_[4] = var1;
      }

      return (byte[])this.break_[4];
   }

   public boolean finally_() {
      return false;
   }

   public FileStore catch_() throws IOException {
      if (this.final_()) {
         return ((rrzf_3)this.break_[0]).class_(this);
      } else {
         throw new NoSuchFileException(((rrzf_3)this.break_[0]).throws_((byte[])this.break_[1]));
      }
   }

   private byte[] extends_() {
      for (int var1 = 0; var1 < ((byte[])this.break_[1]).length; var1++) {
         if (((byte[])this.break_[1])[var1] == 46 && (var1 + 1 == ((byte[])this.break_[1]).length || ((byte[])this.break_[1])[var1 + 1] == 47)) {
            return this.volatile_();
         }
      }

      return (byte[])this.break_[1];
   }

   public rrQs_1 case_() {
      int var1 = ((byte[])this.break_[1]).length;
      if (var1 != 0 && (var1 != 1 || ((byte[])this.break_[1])[0] != 47)) {
         do {
            var1--;
         } while (var1 >= 0 && ((byte[])this.break_[1])[var1] != 47);

         if (var1 <= 0) {
            return this.protected_();
         } else {
            byte[] var2 = new byte[var1];
            System.arraycopy((byte[])this.break_[1], 0, var2, 0, var1);
            return new rrQs_1(this.private_(), var2, true);
         }
      } else {
         return null;
      }
   }

   private void continue_() throws IOException {
      ((rrzf_3)this.break_[0]).class_(this.throws_(), false);
   }

   private static void else_() {
      Object[] var0 = new Object[]{true};
      class_ = var0;
   }

   public rrQs_1 implements_() {
      int var1 = ((byte[])this.break_[1]).length;
      if (var1 != 0 && (var1 != 1 || ((byte[])this.break_[1])[0] != 47)) {
         do {
            var1--;
         } while (var1 >= 0 && ((byte[])this.break_[1])[var1] != 47);

         if (var1 < 0) {
            return this;
         } else {
            var1++;
            byte[] var2 = new byte[((byte[])this.break_[1]).length - var1];
            System.arraycopy((byte[])this.break_[1], var1, var2, 0, var2.length);
            return new rrQs_1(this.private_(), var2, true);
         }
      } else {
         return null;
      }
   }

   private static void new_() {
      case_ = new boolean[]{
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false
      };
   }

   private static void package_() {
      protected_ = new short[]{
         3,
         4,
         0,
         1,
         2,
         1,
         1,
         3,
         4,
         0,
         1,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         2,
         2,
         2,
         2,
         1,
         2,
         1,
         0,
         2,
         2,
         2,
         2,
         1,
         2,
         1,
         0,
         1,
         0,
         4,
         1,
         1,
         1,
         0,
         0,
         0,
         1,
         2,
         2,
         1,
         2,
         2,
         2,
         1,
         2,
         1,
         1,
         0,
         1,
         0,
         0,
         1,
         1,
         0,
         1,
         1,
         1,
         2,
         1,
         2,
         1,
         2,
         0,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         0,
         0,
         0,
         1,
         0,
         2,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         2,
         2,
         4,
         4,
         4,
         0,
         0,
         2,
         0,
         0,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         2,
         2,
         1,
         2,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         1,
         3,
         1,
         3,
         0,
         0,
         1,
         1,
         1,
         255,
         1,
         255,
         0,
         12,
         0,
         12,
         0,
         0,
         0,
         0,
         0,
         0,
         12,
         0,
         0,
         0,
         0,
         0,
         0,
         1,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0
      };
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[5];
         Object[] var1 = this.break_;
         var1[3] = 0;
      }
   }

   public rrQs_1 protected_() {
      return this.isAbsolute() ? ((rrzf_3)this.break_[0]).class_() : null;
   }

   private rrzq_3 protected_(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (byte_[7].equals(var1)) {
         return new rrzq_3(this, false);
      } else if (byte_[8].equals(var1)) {
         return new rrzq_3(this, true);
      } else {
         if ((Boolean)((rrzf_3)this.break_[0]).break_[12]) {
            if ("posix".equals(var1)) {
               return new rrQb_1(this, false);
            }

            if (byte_[10].equals(var1)) {
               return new rrQb_1(this, true);
            }
         }

         throw new UnsupportedOperationException("view <" + var1 + "> is not supported");
      }
   }

   public rrzf_3 private_() {
      return (rrzf_3)this.break_[0];
   }

   private boolean final_() {
      return ((rrzf_3)this.break_[0]).case_(this.throws_());
   }

   private byte[] volatile_() {
      byte[] var1 = new byte[((byte[])this.break_[1]).length];
      int var2 = this.getNameCount();
      int[] var3 = new int[var2];
      int var4 = -1;
      int var5 = 0;

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = ((int[])this.break_[2])[var6];
         int var8 = var6 == ((int[])this.break_[2]).length - 1 ? ((byte[])this.break_[1]).length - var7 : ((int[])this.break_[2])[var6 + 1] - var7 - 1;
         if (var8 == 1 && ((byte[])this.break_[1])[var7] == 46) {
            if (var5 == 0 && ((byte[])this.break_[1])[0] == 47) {
               var1[var5++] = 47;
            }
         } else if (var8 == 2 && ((byte[])this.break_[1])[var7] == 46 && ((byte[])this.break_[1])[var7 + 1] == 46) {
            if (var4 >= 0) {
               var5 = var3[var4--];
            } else if (((byte[])this.break_[1])[0] == 47) {
               if (var5 == 0) {
                  var1[var5++] = 47;
               }
            } else {
               if (var5 != 0 && var1[var5 - 1] != 47) {
                  var1[var5++] = 47;
               }

               while (var8-- > 0) {
                  var1[var5++] = ((byte[])this.break_[1])[var7++];
               }
            }
         } else {
            if (var5 == 0 && ((byte[])this.break_[1])[0] == 47 || var5 != 0 && var1[var5 - 1] != 47) {
               var1[var5++] = 47;
            }

            var4++;
            var3[var4] = var5;

            while (var8-- > 0) {
               var1[var5++] = ((byte[])this.break_[1])[var7++];
            }
         }
      }

      if (var5 > 1 && var1[var5 - 1] == 47) {
         var5--;
      }

      return var5 == var1.length ? var1 : Arrays.copyOf(var1, var5);
   }

   private static void native_() {
      byte_ = new String[]{
         new String("jar"),
         new String("other"),
         new String("other"),
         new String("other"),
         new String("path"),
         new String("Path: nul character not allowed"),
         new String("Path: nul character not allowed"),
         new String("basic"),
         new String("zip"),
         new String("posix"),
         new String("owner"),
         new String("basic"),
         new String("basic")
      };
   }

   @Override
   public int getNameCount() {
      this.int_();
      return ((int[])this.break_[2]).length;
   }

   @Override
   public URI toUri() {
      try {
         return new URI(
            byte_[0],
            byte_(((rrzf_3)this.break_[protected_[44]]).break_().toUri().toString())
               + "!"
               + ((rrzf_3)this.break_[protected_[45]]).throws_((byte[])this.break_().break_[protected_[46]]),
            null
         );
      } catch (Exception var2) {
         throw new AssertionError(var2);
      }
   }

   @Override
   public Path normalize() {
      byte[] var1 = this.extends_();
      return var1 == (byte[])this.break_[1] ? this : new rrQs_1((rrzf_3)this.break_[0], var1, true);
   }

   @Override
   public Path relativize(Path var1) {
      rrQs_1 var2 = this.byte_(var1);
      if (var2.equals(this)) {
         return new rrQs_1((rrzf_3)this.break_[0], new byte[0], true);
      } else if (((byte[])this.break_[1]).length == 0) {
         return var2;
      } else if ((rrzf_3)this.break_[0] == (rrzf_3)var2.break_[0] && this.isAbsolute() == var2.isAbsolute()) {
         if (((byte[])this.break_[1]).length == 1 && ((byte[])this.break_[1])[0] == 47) {
            return new rrQs_1((rrzf_3)this.break_[0], Arrays.copyOfRange((byte[])var2.break_[1], 1, ((byte[])var2.break_[1]).length), true);
         } else {
            int var3 = this.getNameCount();
            int var4 = var2.getNameCount();
            int var5 = Math.min(var3, var4);
            int var6 = 0;

            while (var6 < var5 && this.class_(var2, var6)) {
               var6++;
            }

            int var7 = var3 - var6;
            int var8 = var7 * 3 - 1;
            if (var6 < var4) {
               var8 += ((byte[])var2.break_[1]).length - ((int[])var2.break_[2])[var6] + 1;
            }

            byte[] var9 = new byte[var8];

            int var10;
            for (var10 = 0; var7 > 0; var7--) {
               var9[var10++] = 46;
               var9[var10++] = 46;
               if (var10 < var8) {
                  var9[var10++] = 47;
               }
            }

            if (var6 < var4) {
               System.arraycopy(
                  (byte[])var2.break_[1], ((int[])var2.break_[2])[var6], var9, var10, ((byte[])var2.break_[1]).length - ((int[])var2.break_[2])[var6]
               );
            }

            return new rrQs_1((rrzf_3)this.break_[0], var9);
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public Path resolveSibling(Path var1) {
      Objects.requireNonNull(var1, "other");
      rrQs_1 var2 = this.case_();
      return var2 == null ? var1 : var2.resolve(var1);
   }

   @Override
   public Path resolveSibling(String var1) {
      return this.resolveSibling(((rrzf_3)this.break_[0]).class_(var1));
   }
}
