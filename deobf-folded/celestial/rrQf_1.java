package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.Logger;

public class rrQf_1 {
   public static Object[] id_class;
   private static String[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;

   private static void id_byte() {
      id_byte = new byte[]{2, 2, 2, 32, 2, 32, 2, 32, 2, 32, 8, 2, 2, 32, 2, 2};
   }

   public static CompletableFuture<Map<String, String>> id_byte(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.id_break[1]).info(id_break[34]);

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               Map var5;
               try {
                  HttpPost var2 = new HttpPost(URI.create(id_break[35]));
                  var2.setConfig((RequestConfig)id_class[id_protected[15]]);
                  var2.setHeader(id_break[36], id_break[37]);
                  String var10003 = id_break[38];
                  Object[] var10004 = new Object[1];
                  var10004[id_throws[11]] = var0;
                  var2.setEntity(new StringEntity(String.format(var10003, var10004)));
                  ((Logger)QY.id_break[1]).info(id_break[39], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / 1000);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = var3.getStatusLine().getStatusCode() == 200
                     ? new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject()
                     : new JsonObject();
                  var5 = Optional.ofNullable(var4.get(id_break[40]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : id_throws[16])
                     .map(
                        var1xx -> {
                           String var2x = var4.get(id_break[49])
                              .getAsJsonObject()
                              .get(id_break[50])
                              .getAsJsonArray()
                              .get(id_throws[14])
                              .getAsJsonObject()
                              .get(id_break[51])
                              .getAsString();
                           ((Logger)QY.id_break[1]).info(id_break[52], StringUtils.abbreviateMiddle(var1xx, id_break[53], 32), var2x);
                           return Map.of(id_break[54], var1xx, id_break[55], var2x);
                        }
                     )
                     .orElseThrow(() -> {
                        Exception var10000 = new Exception;
                        String var1xx;
                        if (var4.has(id_break[44])) {
                           var1xx = id_break[45];
                           Object[] var10003x = new Object[2];
                           var10003x[id_throws[12]] = var4.get(id_break[46]).getAsString();
                           var10003x[1] = var4.get(id_break[47]).getAsString();
                           var1xx = String.format(var1xx, var10003x);
                        } else {
                           var1xx = id_break[48];
                        }

                        var10000./* $VF: Unable to resugar constructor */<init>(var1xx);
                        return var10000;
                     });
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.id_break[1]).warn(id_break[41]);
               throw new CancellationException(id_break[42]);
            } catch (Exception var9) {
               ((Logger)QY.id_break[1]).error(id_break[43], var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private rrQf_1() {
      throw new UnsupportedOperationException(id_break[0]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 929109448;
   }

   public static CompletableFuture<String> id_class(Function<Boolean, String> var0, Executor var1, @Nullable rrQj_1 var2) {
      return id_class(var0x -> rqR_2.id_implements().id_class(var0x), var0, var1, var2);
   }

   public static CompletableFuture<String> id_class(String var0, String var1, Executor var2) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.id_break[1]).info(id_break[17]);

            try {
               CloseableHttpClient var2x = HttpClients.createMinimal();

               String var6;
               try {
                  HttpPost var3 = new HttpPost(URI.create(id_break[18]));
                  var3.setConfig((RequestConfig)id_class[id_protected[8]]);
                  var3.setHeader(id_break[19], id_break[20]);
                  String var10003 = id_break[21];
                  Object[] var10004 = new Object[2];
                  var10004[id_throws[4]] = var1;
                  var10004[1] = var0;
                  var3.setEntity(new StringEntity(String.format(var10003, var10004)));
                  ((Logger)QY.id_break[1]).info(id_break[22], var3.getMethod(), var3.getURI().toString(), var3.getConfig().getConnectTimeout() / 1000);
                  CloseableHttpResponse var4 = var2x.execute(var3);
                  JsonObject var5 = new JsonParser().parse(EntityUtils.toString(var4.getEntity())).getAsJsonObject();
                  var6 = Optional.ofNullable(var5.get(id_break[23]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : id_throws[9])
                     .map(var0xx -> {
                        ((Logger)QY.id_break[1]).info(id_break[32], StringUtils.abbreviateMiddle(var0xx, id_break[33], 32));
                        return (String)var0xx;
                     })
                     .orElseThrow(() -> {
                        Exception var10000 = new Exception;
                        String var1xx;
                        if (var5.has(id_break[27])) {
                           var1xx = id_break[28];
                           Object[] var10003x = new Object[2];
                           var10003x[id_throws[6]] = var5.get(id_break[29]).getAsString();
                           var10003x[1] = var5.get(id_break[30]).getAsString();
                           var1xx = String.format(var1xx, var10003x);
                        } else {
                           var1xx = id_break[31];
                        }

                        var10000./* $VF: Unable to resugar constructor */<init>(var1xx);
                        return var10000;
                     });
               } catch (Throwable var8) {
                  if (var2x != null) {
                     try {
                        var2x.close();
                     } catch (Throwable var7) {
                        var8.addSuppressed(var7);
                     }
                  }

                  throw var8;
               }

               if (var2x != null) {
                  var2x.close();
               }

               return var6;
            } catch (InterruptedException var9) {
               ((Logger)QY.id_break[1]).warn(id_break[24]);
               throw new CancellationException(id_break[25]);
            } catch (Exception var10) {
               ((Logger)QY.id_break[1]).error(id_break[26], var10);
               throw new CompletionException(var10);
            }
         },
         var2
      );
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3481563486528196784L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -104, -66, -41, 126, 61, 16, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static CompletableFuture<String> id_class(Consumer<URI> var0, Function<Boolean, String> var1, Executor var2) {
      return id_class(var0, var1, var2, null);
   }

   public static CompletableFuture<String> id_class(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.id_break[1]).info(id_break[56]);

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               String var5;
               try {
                  HttpPost var2 = new HttpPost(URI.create(id_break[57]));
                  var2.setConfig((RequestConfig)id_class[id_protected[23]]);
                  var2.setHeader(id_break[58], id_break[59]);
                  String var10003 = id_break[60];
                  Object[] var10004 = new Object[1];
                  var10004[id_throws[18]] = var0;
                  var2.setEntity(new StringEntity(String.format(var10003, var10004)));
                  ((Logger)QY.id_break[1]).info(id_break[61], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / 1000);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = var3.getStatusLine().getStatusCode() == 200
                     ? new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject()
                     : new JsonObject();
                  var5 = Optional.ofNullable(var4.get(id_break[62]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : id_throws[22])
                     .map(var0xx -> {
                        ((Logger)QY.id_break[1]).info(id_break[71], StringUtils.abbreviateMiddle(var0xx, id_break[72], 32));
                        return (String)var0xx;
                     })
                     .orElseThrow(() -> {
                        Exception var10000 = new Exception;
                        String var1xx;
                        if (var4.has(id_break[66])) {
                           var1xx = id_break[67];
                           Object[] var10003x = new Object[2];
                           var10003x[id_throws[19]] = var4.get(id_break[68]).getAsString();
                           var10003x[1] = var4.get(id_break[69]).getAsString();
                           var1xx = String.format(var1xx, var10003x);
                        } else {
                           var1xx = id_break[70];
                        }

                        var10000./* $VF: Unable to resugar constructor */<init>(var1xx);
                        return var10000;
                     });
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.id_break[1]).warn(id_break[63]);
               throw new CancellationException(id_break[64]);
            } catch (Exception var9) {
               ((Logger)QY.id_break[1]).error(id_break[65], var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private static void id_class() {
      id_protected = new short[]{
         1,
         0,
         1,
         1000,
         1,
         1,
         1,
         1,
         0,
         1,
         1000,
         1,
         1,
         1,
         1,
         0,
         1,
         1000,
         200,
         1,
         1,
         1,
         1,
         0,
         1,
         1000,
         200,
         1,
         1,
         1,
         1,
         0,
         25585,
         1,
         1000,
         1,
         1,
         1,
         1,
         25585,
         1,
         1,
         1,
         1,
         1,
         200,
         30000,
         30000,
         30000
      };
   }

   public static CompletableFuture<String> id_class(Function<Boolean, String> var0, Executor var1) {
      return id_class(var0x -> rqR_2.id_implements().id_class(var0x), var0, var1);
   }

   public static CompletableFuture<String> id_class(Consumer<URI> var0, Function<Boolean, String> var1, Executor var2, @Nullable rrQj_1 var3) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.id_break[1]).info(id_break[97]);

            try {
               String var3x = RandomStringUtils.randomAlphanumeric(8);
               HttpServer var4 = HttpServer.create(new InetSocketAddress(25585), id_throws[29]);
               CountDownLatch var5 = new CountDownLatch(1);
               AtomicReference var6 = new AtomicReference(null);
               AtomicReference var7 = new AtomicReference(null);
               var4.createContext(
                  id_break[98],
                  var5x -> {
                     Map var6x = URLEncodedUtils.parse(var5x.getRequestURI(), id_break[118])
                        .stream()
                        .collect(Collectors.toMap(NameValuePair::getName, NameValuePair::getValue));
                     if (!var3x.equals(var6x.get(id_break[119]))) {
                        String var10001x = id_break[120];
                        Object[] var10002x = new Object[2];
                        var10002x[id_throws[35]] = var3x;
                        var10002x[1] = var6x.get(id_break[121]);
                        var7.set(String.format(var10001x, var10002x));
                     } else if (var6x.containsKey(id_break[122])) {
                        var6.set((String)var6x.get(id_break[123]));
                     } else if (var6x.containsKey(id_break[124])) {
                        String var9x = id_break[125];
                        Object[] var10x = new Object[2];
                        var10x[id_throws[37]] = var6x.get(id_break[126]);
                        var10x[1] = var6x.get(id_break[127]);
                        var7.set(String.format(var9x, var10x));
                     }

                     byte[] var7x = ((String)var1.apply(var7.get() == null ? true : id_throws[40])).getBytes();
                     var5x.sendResponseHeaders(200, (long)var7x.length);
                     OutputStream var8x = var5x.getResponseBody();
                     var8x.write(var7x);
                     var8x.close();
                     var5.countDown();
                  }
               );
               URIBuilder var10000 = new URIBuilder(id_break[99]).addParameter(id_break[100], id_break[101]).addParameter(id_break[102], id_break[103]);
               String var10001 = id_break[104];
               String var10002 = id_break[105];
               Object[] var10003 = new Object[1];
               var10003[id_throws[32]] = var4.getAddress().getPort();
               URIBuilder var8 = var10000.addParameter(var10001, String.format(var10002, var10003))
                  .addParameter(id_break[106], id_break[107])
                  .addParameter(id_break[108], var3x);
               if (var3 != null) {
                  var8.addParameter(id_break[109], var3.toString());
               }

               URI var9 = var8.build();
               ((Logger)QY.id_break[1]).info(id_break[110], var9.toString());
               var0.accept(var9);

               String var10;
               try {
                  ((Logger)QY.id_break[1]).info(id_break[111], var4.getAddress().getPort());
                  var4.start();
                  var5.await();
                  var10 = Optional.ofNullable((String)var6.get()).filter(var0xx -> !var0xx.isBlank() ? true : id_throws[34]).map(var0xx -> {
                     ((Logger)QY.id_break[1]).info(id_break[116], StringUtils.abbreviateMiddle((String)var0xx, id_break[117], 32));
                     return (String)var0xx;
                  }).orElseThrow(() -> new Exception((String)Optional.ofNullable((String)var7.get()).orElse(id_break[115])));
               } finally {
                  var4.stop(2);
               }

               return var10;
            } catch (InterruptedException var16) {
               ((Logger)QY.id_break[1]).warn(id_break[112]);
               throw new CancellationException(id_break[113]);
            } catch (Exception var17) {
               ((Logger)QY.id_break[1]).error(id_break[114], var17);
               throw new CompletionException(var17);
            }
         },
         var2
      );
   }

   public static CompletableFuture<rqN_2> id_break(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.id_break[1]).info(id_break[1]);

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               rqN_2 var5;
               try {
                  HttpGet var2 = new HttpGet(URI.create(id_break[2]));
                  var2.setConfig((RequestConfig)id_class[id_protected[1]]);
                  var2.setHeader(id_break[3], "Bearer " + var0);
                  ((Logger)QY.id_break[1]).info(id_break[4], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / 1000);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject();
                  var5 = Optional.ofNullable(var4.get(id_break[5]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : id_throws[3])
                     .map(var2x -> {
                        ((Logger)QY.id_break[1]).info(id_break[14], var4.get(id_break[15]).getAsString(), var2x);
                        return new rqN_2(var4.get(id_break[16]).getAsString(), var2x, var0, rqc_3.MOJANG.name());
                     })
                     .orElseThrow(() -> {
                        Exception var10000 = new Exception;
                        String var1xx;
                        if (var4.has(id_break[9])) {
                           var1xx = id_break[10];
                           Object[] var10003 = new Object[2];
                           var10003[id_throws[0]] = var4.get(id_break[11]).getAsString();
                           var10003[1] = var4.get(id_break[12]).getAsString();
                           var1xx = String.format(var1xx, var10003);
                        } else {
                           var1xx = id_break[13];
                        }

                        var10000./* $VF: Unable to resugar constructor */<init>(var1xx);
                        return var10000;
                     });
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.id_break[1]).warn(id_break[6]);
               throw new CancellationException(id_break[7]);
            } catch (Exception var9) {
               ((Logger)QY.id_break[1]).error(id_break[8], var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private static void id_break() {
      id_throws = new boolean[]{
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
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
         false,
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
         false,
         false,
         true
      };
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{RequestConfig.custom().setConnectionRequestTimeout(30000).setConnectTimeout(30000).setSocketTimeout(30000).build()};
      id_class = var0;
   }

   public static CompletableFuture<String> id_protected(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.id_break[1]).info(id_break[73]);

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               String var5;
               try {
                  HttpPost var2 = new HttpPost(URI.create(id_break[74]));
                  var2.setConfig((RequestConfig)id_class[id_protected[31]]);
                  var2.setHeader(id_break[75], id_break[76]);
                  BasicNameValuePair var10003 = new BasicNameValuePair(id_break[77], id_break[78]);
                  BasicNameValuePair var10004 = new BasicNameValuePair(id_break[79], id_break[80]);
                  BasicNameValuePair var10005 = new BasicNameValuePair(id_break[81], var0);
                  String var10008 = id_break[82];
                  String var10009 = id_break[83];
                  Object[] var10010 = new Object[1];
                  var10010[id_throws[24]] = 25585;
                  var2.setEntity(
                     new UrlEncodedFormEntity(
                        List.of(var10003, var10004, var10005, new BasicNameValuePair(var10008, String.format(var10009, var10010))), id_break[84]
                     )
                  );
                  ((Logger)QY.id_break[1]).info(id_break[85], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / 1000);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject();
                  var5 = Optional.ofNullable(var4.get(id_break[86]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : id_throws[28])
                     .map(var0xx -> {
                        ((Logger)QY.id_break[1]).info(id_break[95], StringUtils.abbreviateMiddle(var0xx, id_break[96], 32));
                        return (String)var0xx;
                     })
                     .orElseThrow(() -> {
                        Exception var10000 = new Exception;
                        String var1xx;
                        if (var4.has(id_break[90])) {
                           var1xx = id_break[91];
                           Object[] var10003x = new Object[2];
                           var10003x[id_throws[25]] = var4.get(id_break[92]).getAsString();
                           var10003x[1] = var4.get(id_break[93]).getAsString();
                           var1xx = String.format(var1xx, var10003x);
                        } else {
                           var1xx = id_break[94];
                        }

                        var10000./* $VF: Unable to resugar constructor */<init>(var1xx);
                        return var10000;
                     });
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.id_break[1]).warn(id_break[87]);
               throw new CancellationException(id_break[88]);
            } catch (Exception var9) {
               ((Logger)QY.id_break[1]).error(id_break[89], var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private static void id_protected() {
      id_break = new String[]{
         new String("This is a utility class and cannot be instantiated"),
         new String("Fetching Minecraft profile..."),
         new String("https://api.minecraftservices.com/minecraft/profile"),
         new String("Authorization"),
         new String("[{}] {} (timeout={}s)"),
         new String("id"),
         new String("Minecraft profile fetching was cancelled!"),
         new String("Interrupted"),
         new String("Unable to fetch Minecraft profile!"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("errorMessage"),
         new String("There was no profile or error description present."),
         new String("Fetched Minecraft profile! (name={}, uuid={})"),
         new String("name"),
         new String("name"),
         new String("Exchanging Xbox Live XSTS token for a Minecraft access token..."),
         new String("https://api.minecraftservices.com/authentication/login_with_xbox"),
         new String("Content-Type"),
         new String("application/json"),
         new String("{\"identityToken\": \"XBL3.0 x=%s;%s\"}"),
         new String("[{}] {} (timeout={}s)"),
         new String("access_token"),
         new String("Minecraft access token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Minecraft access token!"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("errorMessage"),
         new String("There was no access token or error description present."),
         new String("Acquired Minecraft access token! ({})"),
         new String("..."),
         new String("Exchanging Xbox Live token for an Xbox Live XSTS token..."),
         new String("https://xsts.auth.xboxlive.com/xsts/authorize"),
         new String("Content-Type"),
         new String("application/json"),
         new String(
            "{\n  \"Properties\": {\n    \"SandboxId\": \"RETAIL\",\n    \"UserTokens\": [\"%s\"]\n  },\n  \"RelyingParty\": \"rp://api.minecraftservices.com/\",\n  \"TokenType\": \"JWT\"\n}"
         ),
         new String("[{}] {} (timeout={}s)"),
         new String("Token"),
         new String("Xbox Live XSTS token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Xbox Live XSTS token!"),
         new String("XErr"),
         new String("%s: %s"),
         new String("XErr"),
         new String("Message"),
         new String("There was no access token or error description present."),
         new String("DisplayClaims"),
         new String("xui"),
         new String("uhs"),
         new String("Acquired Xbox Live XSTS token! (token={}, uhs={})"),
         new String("..."),
         new String("Token"),
         new String("uhs"),
         new String("Exchanging Microsoft access token for an Xbox Live access token..."),
         new String("https://user.auth.xboxlive.com/user/authenticate"),
         new String("Content-Type"),
         new String("application/json"),
         new String(
            "{\n  \"Properties\": {\n    \"AuthMethod\": \"RPS\",\n    \"SiteName\": \"user.auth.xboxlive.com\",\n    \"RpsTicket\": \"d=%s\"\n  },\n  \"RelyingParty\": \"http://auth.xboxlive.com\",\n  \"TokenType\": \"JWT\"\n}"
         ),
         new String("[{}] {} (timeout={}s)"),
         new String("Token"),
         new String("Xbox Live access token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Xbox Live access token!"),
         new String("XErr"),
         new String("%s: %s"),
         new String("XErr"),
         new String("Message"),
         new String("There was no access token or error description present."),
         new String("Acquired Xbox Live access token! ({})"),
         new String("..."),
         new String("Exchanging Microsoft auth code for an access token..."),
         new String("https://login.microsoftonline.com/consumers/oauth2/v2.0/token"),
         new String("Content-Type"),
         new String("application/x-www-form-urlencoded"),
         new String("client_id"),
         new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"),
         new String("grant_type"),
         new String("authorization_code"),
         new String("code"),
         new String("redirect_uri"),
         new String("http://localhost:%d/callback"),
         new String("UTF-8"),
         new String("[{}] {} (timeout={}s)"),
         new String("access_token"),
         new String("Microsoft access token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Microsoft access token!"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("error_description"),
         new String("There was no access token or error description present."),
         new String("Acquired Microsoft access token! ({})"),
         new String("..."),
         new String("Acquiring Microsoft auth code..."),
         new String("/callback"),
         new String("https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize"),
         new String("client_id"),
         new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"),
         new String("response_type"),
         new String("code"),
         new String("redirect_uri"),
         new String("http://localhost:%d/callback"),
         new String("scope"),
         new String("XboxLive.signin offline_access"),
         new String("state"),
         new String("prompt"),
         new String("Launching Microsoft login in browser: {}"),
         new String("Begin listening on http://localhost:{}/callback for a successful Microsoft login..."),
         new String("Microsoft auth code acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Microsoft auth code!"),
         new String("There was no auth code or error description present."),
         new String("Acquired Microsoft auth code! ({})"),
         new String("..."),
         new String("UTF-8"),
         new String("state"),
         new String("State mismatch! Expected '%s' but got '%s'."),
         new String("state"),
         new String("code"),
         new String("code"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("error_description")
      };
   }
}
