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
   private static String[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;
   private static boolean[] id_case;

   private void id_byte(rrQs_1 var1, CopyOption... var2) throws IOException {
      boolean var3 = id_case[154];
      boolean var4 = id_case[155];
      CopyOption[] var5 = var2;
      int var6 = var2.length;

      for (int var7 = id_case[156]; var7 < var6; var7++) {
         CopyOption var8 = var5[var7];
         if (var8 == StandardCopyOption.REPLACE_EXISTING) {
            var3 = id_case[157];
         } else if (var8 == StandardCopyOption.COPY_ATTRIBUTES) {
            var4 = id_case[158];
         }
      }

      rrzt_3 var18 = this.id_class();
      boolean var19;
      if (var3) {
         try {
            var1.id_continue();
            var19 = id_case[159];
         } catch (DirectoryNotEmptyException var15) {
            var19 = id_case[160];
         }
      } else {
         var19 = var1.id_final();
      }

      if (var19) {
         throw new FileAlreadyExistsException(var1.toString());
      } else {
         if (var18.isDirectory()) {
            var1.id_class();
         } else {
            try (
               InputStream var20 = ((rrzf_3)this.id_break[id_protected[190]]).id_byte(this.id_throws());
               OutputStream var22 = var1.id_class();
            ) {
               var20.transferTo(var22);
            }
         }

         if (var4) {
            rrzq_3 var21 = var1.id_break(rrzq_3.class);

            try {
               var21.setTimes(var18.lastModifiedTime(), var18.lastAccessTime(), var18.creationTime());
               var21.setPermissions(var18.id_class().orElse(null));
            } catch (IOException var14) {
               try {
                  var1.id_byte();
               } catch (IOException var11) {
               }

               throw var14;
            }
         }
      }
   }

   public void id_byte() throws IOException {
      ((rrzf_3)this.id_break[id_protected[164]]).id_class(this.id_throws(), id_case[137]);
   }

   private static String id_byte(String var0) {
      if (var0 == null) {
         return null;
      } else {
         int var1 = var0.length();
         if (var1 == 0) {
            return var0;
         } else if (var0.indexOf(id_throws[80]) < 0) {
            return var0;
         } else {
            StringBuilder var2 = new StringBuilder(var1);
            byte[] var3 = new byte[var1];
            boolean var4 = id_case[163];
            int var5 = id_case[164];

            while (var5 < var1) {
               char var6 = var0.charAt(var5);
               if (var6 == id_throws[81]) {
                  var4 = id_case[165];
               } else if (var4 && var6 == id_throws[82]) {
                  var4 = id_case[166];
               }

               if (var6 == id_throws[83] && !var4) {
                  int var7;
                  for (var7 = id_case[167]; var6 == id_throws[84]; var6 = var0.charAt(var5)) {
                     if (!(Boolean)id_class[id_protected[192]] && var1 - var5 < id_throws[85]) {
                        throw new AssertionError();
                     }

                     var3[var7++] = (byte)((id_class(var0.charAt(++var5)) & id_throws[86]) << id_throws[87] | id_class(var0.charAt(++var5)) & id_throws[88]);
                     if (++var5 >= var1) {
                        break;
                     }
                  }

                  var2.append(new String(var3, id_case[168], var7, StandardCharsets.UTF_8));
               } else {
                  var2.append(var6);
                  var5++;
               }
            }

            return var2.toString();
         }
      }
   }

   private rrQs_1 id_byte(Path var1) {
      Objects.requireNonNull(var1, id_byte[4]);
      if (!(var1 instanceof rrQs_1)) {
         throw new ProviderMismatchException();
      } else {
         return (rrQs_1)var1;
      }
   }

   private void id_int() {
      if ((int[])this.id_break[id_protected[106]] == null) {
         int var1 = id_case[82];
         int var2 = id_case[83];
         if (((byte[])this.id_break[id_protected[107]]).length == 0) {
            var1 = id_case[84];
         } else {
            while (var2 < ((byte[])this.id_break[id_protected[108]]).length) {
               byte var3 = ((byte[])this.id_break[id_protected[109]])[var2++];
               if (var3 != id_throws[23]) {
                  var1++;

                  while (var2 < ((byte[])this.id_break[id_protected[110]]).length && ((byte[])this.id_break[id_protected[111]])[var2] != id_throws[24]) {
                     var2++;
                  }
               }
            }
         }

         int[] var14 = new int[var1];
         var1 = id_case[85];
         var2 = id_case[86];

         while (var2 < ((byte[])this.id_break[id_protected[112]]).length) {
            byte var4 = ((byte[])this.id_break[id_protected[113]])[var2];
            if (var4 == id_throws[25]) {
               var2++;
            } else {
               var14[var1++] = var2++;

               while (var2 < ((byte[])this.id_break[id_protected[114]]).length && ((byte[])this.id_break[id_protected[115]])[var2] != id_throws[26]) {
                  var2++;
               }
            }
         }

         synchronized (this) {
            if ((int[])this.id_break[id_protected[116]] == null) {
               this.id_break[id_protected[117]] = var14;
            }
         }
      }
   }

   public rrQs_1(rrzf_3 var1, byte[] var2) {
      this(var1, var2, id_case[0]);
   }

   public rrQs_1(rrzf_3 var1, String var2) {
      this.id_super();
      Integer var7 = Integer.valueOf(id_case[2]);
      this.id_break[id_protected[7]] = var7;
      Object var8 = null;
      this.id_break[id_protected[8]] = var8;
      this.id_break[id_protected[9]] = var1;
      byte[] var10 = this.id_throws(var2);
      this.id_break[id_protected[10]] = var10;
   }

   public rrQs_1(rrzf_3 var1, byte[] var2, boolean var3) {
      this.id_super();
      Integer var8 = Integer.valueOf(id_case[1]);
      this.id_break[id_protected[0]] = var8;
      Object var9 = null;
      this.id_break[id_protected[1]] = var9;
      this.id_break[id_protected[2]] = var1;
      if (var3) {
         this.id_break[id_protected[3]] = var2;
      } else if (((rrzC_2)var1.id_break[id_protected[4]]).id_class()) {
         byte[] var12 = this.id_break(var2);
         this.id_break[id_protected[5]] = var12;
      } else {
         byte[] var13 = this.id_throws(var1.id_throws(var2));
         this.id_break[id_protected[6]] = var13;
      }
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof rrQs_1
            && (rrzf_3)this.id_break[id_protected[150]] == (rrzf_3)((rrQs_1)var1).id_break[id_protected[151]]
            && this.compareTo((Path)var1) == 0
         ? id_case[124]
         : id_case[125];
   }

   @Override
   public String toString() {
      return ((rrzf_3)this.id_break[id_protected[145]]).id_throws((byte[])this.id_break[id_protected[146]]);
   }

   @Override
   public int hashCode() {
      int var1 = (Integer)this.id_break[id_protected[147]];
      if (var1 == 0) {
         Integer var6 = var1 = Arrays.hashCode((byte[])this.id_break[id_protected[148]]);
         this.id_break[id_protected[149]] = var6;
      }

      return var1;
   }

   @Override
   public int compareTo(Path var1) {
      rrQs_1 var2 = this.id_byte(var1);
      int var3 = ((byte[])this.id_break[id_protected[152]]).length;
      int var4 = ((byte[])var2.id_break[id_protected[153]]).length;
      int var5 = Math.min(var3, var4);

      for (int var6 = id_case[126]; var6 < var5; var6++) {
         int var7 = ((byte[])this.id_break[id_protected[154]])[var6] & id_protected[155];
         int var8 = ((byte[])var2.id_break[id_protected[156]])[var6] & id_protected[157];
         if (var7 != var8) {
            return var7 - var8;
         }
      }

      return var3 - var4;
   }

   private static void id_this() {
      id_throws = new byte[]{
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
      return this.startsWith(((rrzf_3)this.id_break[id_protected[102]]).id_class(var1));
   }

   @Override
   public boolean startsWith(Path var1) {
      Objects.requireNonNull(var1, id_byte[2]);
      if (!(var1 instanceof rrQs_1 var2)) {
         return id_case[59];
      } else if (var2.isAbsolute() == this.isAbsolute() && ((byte[])var2.id_break[id_protected[82]]).length <= ((byte[])this.id_break[id_protected[83]]).length
         )
       {
         int var3 = ((byte[])var2.id_break[id_protected[84]]).length;

         for (int var4 = id_case[61]; var4 < var3; var4++) {
            if (((byte[])var2.id_break[id_protected[85]])[var4] != ((byte[])this.id_break[id_protected[86]])[var4]) {
               return id_case[62];
            }
         }

         var3--;
         return ((byte[])var2.id_break[id_protected[87]]).length != ((byte[])this.id_break[id_protected[88]]).length
               && ((byte[])var2.id_break[id_protected[89]])[var3] != id_throws[13]
               && ((byte[])this.id_break[id_protected[90]])[var3 + id_case[63]] != id_throws[14]
            ? id_case[65]
            : id_case[64];
      } else {
         return id_case[60];
      }
   }

   @Override
   public Iterator<Path> iterator() {
      return new rrQE(this);
   }

   @Override
   public boolean endsWith(Path var1) {
      Objects.requireNonNull(var1, id_byte[3]);
      if (!(var1 instanceof rrQs_1 var2)) {
         return id_case[66];
      } else {
         int var3 = ((byte[])var2.id_break[id_protected[91]]).length - id_case[67];
         if (var3 > 0 && ((byte[])var2.id_break[id_protected[92]])[var3] == id_throws[15]) {
            var3--;
         }

         int var4 = ((byte[])this.id_break[id_protected[93]]).length - id_case[68];
         if (var4 > 0 && ((byte[])this.id_break[id_protected[94]])[var4] == id_throws[16]) {
            var4--;
         }

         if (var3 == id_throws[17]) {
            return var4 == id_throws[18] ? id_case[69] : id_case[70];
         } else if ((!var2.isAbsolute() || this.isAbsolute() && var3 == var4) && var4 >= var3) {
            while (var3 >= 0) {
               if (((byte[])var2.id_break[id_protected[95]])[var3] != ((byte[])this.id_break[id_protected[96]])[var4]) {
                  return id_case[72];
               }

               var3--;
               var4--;
            }

            return ((byte[])var2.id_break[id_protected[97]])[var3 + id_case[73]] != id_throws[19]
                  && var4 != id_throws[20]
                  && ((byte[])this.id_break[id_protected[98]])[var4] != id_throws[21]
               ? id_case[75]
               : id_case[74];
         } else {
            return id_case[71];
         }
      }
   }

   @Override
   public boolean endsWith(String var1) {
      return this.endsWith(((rrzf_3)this.id_break[id_protected[103]]).id_class(var1));
   }

   public void id_class(Set<PosixFilePermission> var1) throws IOException {
      ((rrzf_3)this.id_break[id_protected[171]]).id_class(this.id_throws(), var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, 102, -6, -50, 24, 63, -91, -10}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(UserPrincipal var1) throws IOException {
      ((rrzf_3)this.id_break[id_protected[170]]).id_class(this.id_throws(), var1);
   }

   private byte[] id_class(String var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder(var3);
      var4.append(var1, id_case[103], var2);
      int var5 = id_case[104];

      while (var2 < var3) {
         int var6 = var1.charAt(var2++);
         if (var6 == id_throws[40]) {
            var6 = id_throws[41];
         }

         if (var6 != id_throws[42] || var5 != id_throws[43]) {
            if (var6 == 0) {
               throw new InvalidPathException(var1, id_byte[6]);
            }

            var4.append((char)var6);
            var5 = var6;
         }
      }

      var3 = var4.length();
      if (var3 > id_case[105] && var5 == id_throws[44]) {
         var4.delete(var3 - id_case[106], var3);
      }

      return ((rrzf_3)this.id_break[id_protected[126]]).id_class(var4.toString());
   }

   public void id_class(FileAttribute<?>... var1) throws IOException {
      ((rrzf_3)this.id_break[id_protected[162]]).id_class(this.id_throws(), var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2865024496306738926L;
   }

   public OutputStream id_class(OpenOption... var1) throws IOException {
      if (var1.length == 0) {
         rrzf_3 var10000 = (rrzf_3)this.id_break[id_protected[182]];
         byte[] var10001 = this.id_throws();
         OpenOption[] var10002 = new OpenOption[id_throws[66]];
         var10002[id_case[150]] = StandardOpenOption.CREATE;
         var10002[id_case[151]] = StandardOpenOption.TRUNCATE_EXISTING;
         var10002[id_throws[67]] = StandardOpenOption.WRITE;
         return var10000.id_class(var10001, var10002);
      } else {
         return ((rrzf_3)this.id_break[id_protected[183]]).id_class(this.id_throws(), var1);
      }
   }

   public void id_class(String var1, Object var2, LinkOption... var3) throws IOException {
      int var6 = var1.indexOf(id_throws[62]);
      String var4;
      String var5;
      if (var6 == id_throws[63]) {
         var4 = id_byte[11];
         var5 = var1;
      } else {
         var4 = var1.substring(id_case[139], var6++);
         var5 = var1.substring(var6);
      }

      this.id_protected(var4).id_class(var5, var2);
   }

   public SeekableByteChannel id_class(Set<? extends OpenOption> var1, FileAttribute<?>... var2) throws IOException {
      return ((rrzf_3)this.id_break[id_protected[176]]).id_break(this.id_throws(), var1, var2);
   }

   private byte[] id_class(byte[] var1, int var2) {
      byte[] var3 = new byte[var1.length];

      int var4;
      for (var4 = id_case[92]; var4 < var2; var4++) {
         var3[var4] = var1[var4];
      }

      int var5 = var4;
      byte var6 = id_case[93];

      while (var4 < var1.length) {
         byte var7 = var1[var4++];
         if (var7 == id_throws[31]) {
            var7 = id_throws[32];
         }

         if (var7 != id_throws[33] || var6 != id_throws[34]) {
            if (var7 == 0) {
               throw new InvalidPathException(((rrzf_3)this.id_break[id_protected[121]]).id_throws(var1), id_byte[5]);
            }

            var3[var5++] = var7;
            var6 = var7;
         }
      }

      if (var5 > id_case[94] && var3[var5 - id_case[95]] == id_throws[35]) {
         var5--;
      }

      return var5 == var3.length ? var3 : Arrays.copyOf(var3, var5);
   }

   public rrQs_1 id_class(Path var1) {
      rrQs_1 var2 = this.id_byte(var1);
      if (((byte[])var2.id_break[id_protected[76]]).length == 0) {
         return this;
      } else {
         return !var2.isAbsolute() && ((byte[])this.id_break[id_protected[77]]).length != 0 ? this.id_class((byte[])var2.id_break[id_protected[78]]) : var2;
      }
   }

   public rrQs_1 id_class(LinkOption... var1) throws IOException {
      byte[] var3 = this.id_throws();
      rrQs_1 var2;
      if (var3 == (byte[])this.id_break[id_protected[37]]) {
         var2 = this;
      } else {
         var2 = new rrQs_1((rrzf_3)this.id_break[id_protected[38]], var3, id_case[18]);
         var2.id_break[id_protected[39]] = var3;
      }

      var2.id_class();
      return var2;
   }

   private static int id_class(char var0) {
      if (var0 >= id_throws[68] && var0 <= id_throws[69]) {
         return var0 - id_throws[70];
      } else if (var0 >= id_throws[71] && var0 <= id_throws[72]) {
         return var0 - id_throws[73] + id_throws[74];
      } else if (var0 >= id_throws[75] && var0 <= id_throws[76]) {
         return var0 - id_throws[77] + id_throws[78];
      } else if (!(Boolean)id_class[id_protected[191]]) {
         throw new AssertionError();
      } else {
         return id_throws[79];
      }
   }

   public rrQs_1 id_class(int var1) {
      this.id_int();
      if (var1 >= 0 && var1 < ((int[])this.id_break[id_protected[22]]).length) {
         int var2 = ((int[])this.id_break[id_protected[23]])[var1];
         int var3;
         if (var1 == ((int[])this.id_break[id_protected[24]]).length - id_case[12]) {
            var3 = ((byte[])this.id_break[id_protected[25]]).length - var2;
         } else {
            var3 = ((int[])this.id_break[id_protected[26]])[var1 + id_case[13]] - var2 - id_case[14];
         }

         byte[] var4 = new byte[var3];
         System.arraycopy((byte[])this.id_break[id_protected[27]], var2, var4, id_case[15], var3);
         return new rrQs_1((rrzf_3)this.id_break[id_protected[28]], var4);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void id_class(AccessMode... var1) throws IOException {
      boolean var2 = id_case[145];
      boolean var3 = id_case[146];
      AccessMode[] var4 = var1;
      int var5 = var1.length;

      for (int var6 = id_case[147]; var6 < var5; var6++) {
         AccessMode var7 = var4[var6];
         switch (((int[])rrQG.id_class[id_protected[178]])[var7.ordinal()]) {
            case 1:
               break;
            case 2:
               var2 = id_case[148];
               break;
            case 3:
               var3 = id_case[149];
               break;
            default:
               throw new UnsupportedOperationException();
         }
      }

      ((rrzf_3)this.id_break[id_protected[179]]).id_class(this.id_throws());
      if (var2 && ((rrzf_3)this.id_break[id_protected[180]]).isReadOnly() || var3) {
         throw new AccessDeniedException(this.toString());
      }
   }

   public Map<String, Object> id_class(String var1, LinkOption... var2) throws IOException {
      int var5 = var1.indexOf(id_throws[64]);
      String var3;
      String var4;
      if (var5 == id_throws[65]) {
         var3 = id_byte[12];
         var4 = var1;
      } else {
         var3 = var1.substring(id_case[140], var5++);
         var4 = var1.substring(var5);
      }

      return this.id_protected(var3).id_break(var4);
   }

   public rrQs_1 id_class(int var1, int var2) {
      this.id_int();
      if (var1 >= 0 && var1 < ((int[])this.id_break[id_protected[29]]).length && var2 <= ((int[])this.id_break[id_protected[30]]).length && var1 < var2) {
         int var3 = ((int[])this.id_break[id_protected[31]])[var1];
         int var4;
         if (var2 == ((int[])this.id_break[id_protected[32]]).length) {
            var4 = ((byte[])this.id_break[id_protected[33]]).length - var3;
         } else {
            var4 = ((int[])this.id_break[id_protected[34]])[var2] - var3 - id_case[16];
         }

         byte[] var5 = new byte[var4];
         System.arraycopy((byte[])this.id_break[id_protected[35]], var3, var5, id_case[17], var4);
         return new rrQs_1((rrzf_3)this.id_break[id_protected[36]], var5);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void id_class(rrQs_1 var1, CopyOption... var2) throws IOException {
      if (Files.isSameFile(((rrzf_3)this.id_break[id_protected[184]]).id_break(), ((rrzf_3)var1.id_break[id_protected[185]]).id_break())) {
         ((rrzf_3)this.id_break[id_protected[186]]).id_class(id_case[152], this.id_throws(), var1.id_throws(), var2);
      } else {
         this.id_byte(var1, var2);
         this.id_byte();
      }
   }

   public rrzt_3 id_class() throws IOException {
      rrzt_3 var1 = ((rrzf_3)this.id_break[id_protected[166]]).id_break(this.id_throws());
      if (var1 == null) {
         throw new NoSuchFileException(this.toString());
      } else {
         return var1;
      }
   }

   public DirectoryStream<Path> id_class(Filter<? super Path> var1) throws IOException {
      return new rrzy_3(this, var1);
   }

   private boolean id_class(rrQs_1 var1, int var2) {
      int var3 = ((int[])this.id_break[id_protected[47]])[var2];
      int var4;
      if (var2 == ((int[])this.id_break[id_protected[48]]).length - id_case[26]) {
         var4 = ((byte[])this.id_break[id_protected[49]]).length - var3;
      } else {
         var4 = ((int[])this.id_break[id_protected[50]])[var2 + id_case[27]] - var3 - id_case[28];
      }

      int var5 = ((int[])var1.id_break[id_protected[51]])[var2];
      int var6;
      if (var2 == ((int[])var1.id_break[id_protected[52]]).length - id_case[29]) {
         var6 = ((byte[])var1.id_break[id_protected[53]]).length - var5;
      } else {
         var6 = ((int[])var1.id_break[id_protected[54]])[var2 + id_case[30]] - var5 - id_case[31];
      }

      if (var4 != var6) {
         return id_case[32];
      } else {
         for (int var7 = id_case[33]; var7 < var4; var7++) {
            if (((byte[])this.id_break[id_protected[55]])[var3 + var7] != ((byte[])var1.id_break[id_protected[56]])[var5 + var7]) {
               return id_case[34];
            }
         }

         return id_case[35];
      }
   }

   public <A extends BasicFileAttributes> A id_class(Class<A> var1) throws IOException {
      if (var1 == BasicFileAttributes.class || var1 == rrzt_3.class) {
         return (A)this.id_class();
      } else if (var1 == PosixFileAttributes.class && (Boolean)((rrzf_3)this.id_break[id_protected[167]]).id_break[id_protected[168]]) {
         return (A)this.id_class();
      } else {
         throw new UnsupportedOperationException("Attributes of type " + var1.getName() + " not supported");
      }
   }

   public void id_class(GroupPrincipal var1) throws IOException {
      ((rrzf_3)this.id_break[id_protected[172]]).id_class(this.id_throws(), var1);
   }

   private rrQs_1 id_class(byte[] var1) {
      byte[] var3 = (byte[])this.id_break[id_protected[79]];
      int var4 = var3.length;
      int var5 = var1.length;
      byte[] var2;
      if (((byte[])this.id_break[id_protected[80]])[var4 - id_case[49]] == id_throws[11]) {
         var2 = new byte[var4 + var5];
         System.arraycopy(var3, id_case[50], var2, id_case[51], var4);
         System.arraycopy(var1, id_case[52], var2, var4, var5);
      } else {
         var2 = new byte[var4 + id_case[53] + var5];
         System.arraycopy(var3, id_case[54], var2, id_case[55], var4);
         var2[var4] = id_throws[12];
         System.arraycopy(var1, id_case[56], var2, var4 + id_case[57], var5);
      }

      return new rrQs_1((rrzf_3)this.id_break[id_protected[81]], var2, id_case[58]);
   }

   public void id_class(FileTime var1, FileTime var2, FileTime var3) throws IOException {
      ((rrzf_3)this.id_break[id_protected[169]]).id_class(this.id_throws(), var1, var2, var3);
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
      return ((byte[])this.id_break[id_protected[74]]).length > 0 && ((byte[])this.id_break[id_protected[75]])[id_case[46]] == id_throws[10]
         ? id_case[47]
         : id_case[48];
   }

   @Override
   public File toFile() {
      throw new UnsupportedOperationException();
   }

   private byte[] id_break(byte[] var1) {
      int var2 = var1.length;
      if (var2 == 0) {
         return var1;
      } else {
         byte var3 = id_case[87];

         for (int var4 = id_case[88]; var4 < var2; var4++) {
            byte var5 = var1[var4];
            if (var5 == id_throws[27] || var5 == 0) {
               return this.id_class(var1, var4);
            }

            if (var5 == id_throws[28] && var3 == id_throws[29]) {
               return this.id_class(var1, var4 - id_case[89]);
            }

            var3 = var5;
         }

         return var2 > id_case[90] && var3 == id_throws[30] ? Arrays.copyOf(var1, var2 - id_case[91]) : var1;
      }
   }

   public <V extends FileAttributeView> V id_break(Class<V> var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (var1 == BasicFileAttributeView.class) {
         return (V)(new rrzq_3(this, id_case[128]));
      } else if (var1 == rrzq_3.class) {
         return (V)(new rrzq_3(this, id_case[129]));
      } else {
         if ((Boolean)((rrzf_3)this.id_break[id_protected[158]]).id_break[id_protected[159]]) {
            if (var1 == PosixFileAttributeView.class) {
               return (V)(new rrQb_1(this, id_case[130]));
            }

            if (var1 == FileOwnerAttributeView.class) {
               return (V)(new rrQb_1(this, id_case[131]));
            }
         }

         return null;
      }
   }

   public rrQs_1 id_break() {
      if (this.isAbsolute()) {
         return this;
      } else {
         byte[] var1 = new byte[((byte[])this.id_break[id_protected[40]]).length + id_case[21]];
         System.arraycopy((byte[])this.id_break[id_protected[41]], id_case[22], var1, id_case[23], ((byte[])this.id_break[id_protected[42]]).length);
         var1[id_case[24]] = id_throws[4];
         return new rrQs_1((rrzf_3)this.id_break[id_protected[43]], var1, id_case[25]);
      }
   }

   public boolean id_break(Path var1) throws IOException {
      if (this.equals(var1)) {
         return id_case[141];
      } else if (var1 != null && this.id_private() == var1.getFileSystem()) {
         this.id_class();
         ((rrQs_1)var1).id_class();
         return Arrays.equals(this.id_throws(), ((rrQs_1)var1).id_throws());
      } else {
         return id_case[142];
      }
   }

   public rrQs_1 id_break(String var1) {
      byte[] var2 = this.id_throws(var1);
      if (var2.length == 0) {
         return this;
      } else {
         return var2[id_case[76]] != id_throws[22] && ((byte[])this.id_break[id_protected[99]]).length != 0
            ? this.id_class(var2)
            : new rrQs_1((rrzf_3)this.id_break[id_protected[100]], var2, id_case[77]);
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -745263386;
   }

   public void id_break(rrQs_1 var1, CopyOption... var2) throws IOException {
      if (Files.isSameFile(((rrzf_3)this.id_break[id_protected[187]]).id_break(), ((rrzf_3)var1.id_break[id_protected[188]]).id_break())) {
         ((rrzf_3)this.id_break[id_protected[189]]).id_class(id_case[153], this.id_throws(), var1.id_throws(), var2);
      } else {
         this.id_byte(var1, var2);
      }
   }

   public InputStream id_break(OpenOption... var1) throws IOException {
      if (var1.length > 0) {
         OpenOption[] var2 = var1;
         int var3 = var1.length;

         for (int var4 = id_case[136]; var4 < var3; var4++) {
            OpenOption var5 = var2[var4];
            if (var5 != StandardOpenOption.READ) {
               throw new UnsupportedOperationException("'" + var5 + "' not allowed");
            }
         }
      }

      return ((rrzf_3)this.id_break[id_protected[163]]).id_byte(this.id_throws());
   }

   public FileChannel id_break(Set<? extends OpenOption> var1, FileAttribute<?>... var2) throws IOException {
      return ((rrzf_3)this.id_break[id_protected[177]]).id_class(this.id_throws(), var1, var2);
   }

   private byte[] id_throws(String var1) {
      if (((rrzC_2)((rrzf_3)this.id_break[id_protected[122]]).id_break[id_protected[123]]).id_class()) {
         return this.id_break(((rrzf_3)this.id_break[id_protected[124]]).id_class(var1));
      } else {
         int var2 = var1.length();
         if (var2 == 0) {
            return new byte[id_case[96]];
         } else {
            char var3 = id_case[97];

            for (int var4 = id_case[98]; var4 < var2; var4++) {
               char var5 = var1.charAt(var4);
               if (var5 == id_throws[36] || var5 == 0) {
                  return this.id_class(var1, var4, var2);
               }

               if (var5 == id_throws[37] && var3 == id_throws[38]) {
                  return this.id_class(var1, var4 - id_case[99], var2);
               }

               var3 = var5;
            }

            if (var2 > id_case[100] && var3 == id_throws[39]) {
               var1 = var1.substring(id_case[101], var2 - id_case[102]);
            }

            return ((rrzf_3)this.id_break[id_protected[125]]).id_class(var1);
         }
      }
   }

   public byte[] id_throws() {
      byte[] var1 = (byte[])this.id_break[id_protected[118]];
      if (var1 == null) {
         if (this.isAbsolute()) {
            var1 = this.id_extends();
         } else {
            var1 = this.id_break().id_throws();
         }

         this.id_break[id_protected[119]] = var1;
      }

      return (byte[])this.id_break[id_protected[120]];
   }

   public boolean id_finally() {
      return id_case[20];
   }

   public FileStore id_catch() throws IOException {
      if (this.id_final()) {
         return ((rrzf_3)this.id_break[id_protected[173]]).id_class(this);
      } else {
         throw new NoSuchFileException(((rrzf_3)this.id_break[id_protected[174]]).id_throws((byte[])this.id_break[id_protected[175]]));
      }
   }

   private byte[] id_extends() {
      for (int var1 = id_case[107]; var1 < ((byte[])this.id_break[id_protected[127]]).length; var1++) {
         if (((byte[])this.id_break[id_protected[128]])[var1] == id_throws[45]
            && (
               var1 + id_case[108] == ((byte[])this.id_break[id_protected[129]]).length
                  || ((byte[])this.id_break[id_protected[130]])[var1 + id_case[109]] == id_throws[46]
            )) {
            return this.id_volatile();
         }
      }

      return (byte[])this.id_break[id_protected[131]];
   }

   public rrQs_1 id_case() {
      int var1 = ((byte[])this.id_break[id_protected[17]]).length;
      if (var1 != 0 && (var1 != id_case[7] || ((byte[])this.id_break[id_protected[18]])[id_case[8]] != id_throws[2])) {
         do {
            var1--;
         } while (var1 >= 0 && ((byte[])this.id_break[id_protected[19]])[var1] != id_throws[3]);

         if (var1 <= 0) {
            return this.id_protected();
         } else {
            byte[] var2 = new byte[var1];
            System.arraycopy((byte[])this.id_break[id_protected[20]], id_case[9], var2, id_case[10], var1);
            return new rrQs_1(this.id_private(), var2, id_case[11]);
         }
      } else {
         return null;
      }
   }

   private void id_continue() throws IOException {
      ((rrzf_3)this.id_break[id_protected[165]]).id_class(this.id_throws(), id_case[138]);
   }

   private static void id_else() {
      Object[] var0 = new Object[]{true};
      id_class = var0;
   }

   public rrQs_1 id_implements() {
      int var1 = ((byte[])this.id_break[id_protected[12]]).length;
      if (var1 != 0 && (var1 != id_case[3] || ((byte[])this.id_break[id_protected[13]])[id_case[4]] != id_throws[0])) {
         do {
            var1--;
         } while (var1 >= 0 && ((byte[])this.id_break[id_protected[14]])[var1] != id_throws[1]);

         if (var1 < 0) {
            return this;
         } else {
            var1++;
            byte[] var2 = new byte[((byte[])this.id_break[id_protected[15]]).length - var1];
            System.arraycopy((byte[])this.id_break[id_protected[16]], var1, var2, id_case[5], var2.length);
            return new rrQs_1(this.id_private(), var2, id_case[6]);
         }
      } else {
         return null;
      }
   }

   private static void id_new() {
      id_case = new boolean[]{
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

   private static void id_package() {
      id_protected = new short[]{
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

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[89]];
         Object[] var1 = this.id_break;
         var1[id_throws[90]] = Integer.valueOf(id_case[172]);
      }
   }

   public rrQs_1 id_protected() {
      return this.isAbsolute() ? ((rrzf_3)this.id_break[id_protected[11]]).id_class() : null;
   }

   private rrzq_3 id_protected(String var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (id_byte[7].equals(var1)) {
         return new rrzq_3(this, id_case[132]);
      } else if (id_byte[8].equals(var1)) {
         return new rrzq_3(this, id_case[133]);
      } else {
         if ((Boolean)((rrzf_3)this.id_break[id_protected[160]]).id_break[id_protected[161]]) {
            if (id_byte[9].equals(var1)) {
               return new rrQb_1(this, id_case[134]);
            }

            if (id_byte[10].equals(var1)) {
               return new rrQb_1(this, id_case[135]);
            }
         }

         throw new UnsupportedOperationException("view <" + var1 + "> is not supported");
      }
   }

   public rrzf_3 id_private() {
      return (rrzf_3)this.id_break[id_protected[73]];
   }

   private boolean id_final() {
      return ((rrzf_3)this.id_break[id_protected[181]]).id_case(this.id_throws());
   }

   private byte[] id_volatile() {
      byte[] var1 = new byte[((byte[])this.id_break[id_protected[132]]).length];
      int var2 = this.getNameCount();
      int[] var3 = new int[var2];
      int var4 = id_throws[47];
      int var5 = id_case[110];

      for (int var6 = id_case[111]; var6 < var2; var6++) {
         int var7 = ((int[])this.id_break[id_protected[133]])[var6];
         int var8 = var6 == ((int[])this.id_break[id_protected[134]]).length - id_case[112]
            ? ((byte[])this.id_break[id_protected[135]]).length - var7
            : ((int[])this.id_break[id_protected[136]])[var6 + id_case[113]] - var7 - id_case[114];
         if (var8 == id_case[115] && ((byte[])this.id_break[id_protected[137]])[var7] == id_throws[48]) {
            if (var5 == 0 && ((byte[])this.id_break[id_protected[138]])[id_case[116]] == id_throws[49]) {
               var1[var5++] = id_throws[50];
            }
         } else if (var8 == id_throws[51]
            && ((byte[])this.id_break[id_protected[139]])[var7] == id_throws[52]
            && ((byte[])this.id_break[id_protected[140]])[var7 + id_case[117]] == id_throws[53]) {
            if (var4 >= 0) {
               var5 = var3[var4--];
            } else if (((byte[])this.id_break[id_protected[141]])[id_case[118]] == id_throws[54]) {
               if (var5 == 0) {
                  var1[var5++] = id_throws[55];
               }
            } else {
               if (var5 != 0 && var1[var5 - id_case[119]] != id_throws[56]) {
                  var1[var5++] = id_throws[57];
               }

               while (var8-- > 0) {
                  var1[var5++] = ((byte[])this.id_break[id_protected[142]])[var7++];
               }
            }
         } else {
            if (var5 == 0 && ((byte[])this.id_break[id_protected[143]])[id_case[120]] == id_throws[58]
               || var5 != 0 && var1[var5 - id_case[121]] != id_throws[59]) {
               var1[var5++] = id_throws[60];
            }

            var4++;
            var3[var4] = var5;

            while (var8-- > 0) {
               var1[var5++] = ((byte[])this.id_break[id_protected[144]])[var7++];
            }
         }
      }

      if (var5 > id_case[122] && var1[var5 - id_case[123]] == id_throws[61]) {
         var5--;
      }

      return var5 == var1.length ? var1 : Arrays.copyOf(var1, var5);
   }

   private static void id_native() {
      id_byte = new String[]{
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
      this.id_int();
      return ((int[])this.id_break[id_protected[21]]).length;
   }

   @Override
   public URI toUri() {
      try {
         return new URI(
            id_byte[0],
            id_byte(((rrzf_3)this.id_break[id_protected[44]]).id_break().toUri().toString())
               + "!"
               + ((rrzf_3)this.id_break[id_protected[45]]).id_throws((byte[])this.id_break().id_break[id_protected[46]]),
            null
         );
      } catch (Exception var2) {
         throw new AssertionError(var2);
      }
   }

   @Override
   public Path normalize() {
      byte[] var1 = this.id_extends();
      return var1 == (byte[])this.id_break[id_protected[104]] ? this : new rrQs_1((rrzf_3)this.id_break[id_protected[105]], var1, id_case[81]);
   }

   @Override
   public Path relativize(Path var1) {
      rrQs_1 var2 = this.id_byte(var1);
      if (var2.equals(this)) {
         return new rrQs_1((rrzf_3)this.id_break[id_protected[57]], new byte[id_case[36]], id_case[37]);
      } else if (((byte[])this.id_break[id_protected[58]]).length == 0) {
         return var2;
      } else if ((rrzf_3)this.id_break[id_protected[59]] == (rrzf_3)var2.id_break[id_protected[60]] && this.isAbsolute() == var2.isAbsolute()) {
         if (((byte[])this.id_break[id_protected[61]]).length == id_case[38] && ((byte[])this.id_break[id_protected[62]])[id_case[39]] == id_throws[5]) {
            return new rrQs_1(
               (rrzf_3)this.id_break[id_protected[63]],
               Arrays.copyOfRange((byte[])var2.id_break[id_protected[64]], id_case[40], ((byte[])var2.id_break[id_protected[65]]).length),
               id_case[41]
            );
         } else {
            int var3 = this.getNameCount();
            int var4 = var2.getNameCount();
            int var5 = Math.min(var3, var4);
            int var6 = id_case[42];

            while (var6 < var5 && this.id_class(var2, var6)) {
               var6++;
            }

            int var7 = var3 - var6;
            int var8 = var7 * id_throws[6] - id_case[43];
            if (var6 < var4) {
               var8 += ((byte[])var2.id_break[id_protected[66]]).length - ((int[])var2.id_break[id_protected[67]])[var6] + id_case[44];
            }

            byte[] var9 = new byte[var8];

            int var10;
            for (var10 = id_case[45]; var7 > 0; var7--) {
               var9[var10++] = id_throws[7];
               var9[var10++] = id_throws[8];
               if (var10 < var8) {
                  var9[var10++] = id_throws[9];
               }
            }

            if (var6 < var4) {
               System.arraycopy(
                  (byte[])var2.id_break[id_protected[68]],
                  ((int[])var2.id_break[id_protected[69]])[var6],
                  var9,
                  var10,
                  ((byte[])var2.id_break[id_protected[70]]).length - ((int[])var2.id_break[id_protected[71]])[var6]
               );
            }

            return new rrQs_1((rrzf_3)this.id_break[id_protected[72]], var9);
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public Path resolveSibling(Path var1) {
      Objects.requireNonNull(var1, id_byte[1]);
      rrQs_1 var2 = this.id_case();
      return var2 == null ? var1 : var2.resolve(var1);
   }

   @Override
   public Path resolveSibling(String var1) {
      return this.resolveSibling(((rrzf_3)this.id_break[id_protected[101]]).id_class(var1));
   }
}
