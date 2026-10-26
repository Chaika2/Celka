/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.RandomStringUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.http.HttpEntity
 *  org.apache.http.NameValuePair
 *  org.apache.http.client.config.RequestConfig
 *  org.apache.http.client.entity.UrlEncodedFormEntity
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.client.utils.URIBuilder
 *  org.apache.http.client.utils.URLEncodedUtils
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 *  org.apache.http.message.BasicNameValuePair
 *  org.apache.http.util.EntityUtils
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.QY;
import celestial.rqN_2;
import celestial.rqR_2;
import celestial.rqc_3;
import celestial.rrQj_1;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
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
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
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

    public static CompletableFuture<Map<String, String>> id_byte(String string, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            Map map;
            block9: {
                ((Logger)QY.id_break[id_protected[14]]).info(id_break[34]);
                CloseableHttpClient closeableHttpClient = HttpClients.createMinimal();
                try {
                    HttpPost httpPost = new HttpPost(URI.create(id_break[35]));
                    httpPost.setConfig((RequestConfig)id_class[id_protected[15]]);
                    httpPost.setHeader(id_break[36], id_break[37]);
                    Object[] objectArray = new Object[id_throws[10]];
                    objectArray[rrQf_1.id_throws[11]] = string;
                    httpPost.setEntity((HttpEntity)new StringEntity(String.format(id_break[38], objectArray)));
                    ((Logger)QY.id_break[id_protected[16]]).info(id_break[39], (Object)httpPost.getMethod(), (Object)httpPost.getURI().toString(), (Object)(httpPost.getConfig().getConnectTimeout() / id_protected[17]));
                    CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
                    JsonObject jsonObject = closeableHttpResponse.getStatusLine().getStatusCode() == id_protected[18] ? new JsonParser().parse(EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity())).getAsJsonObject() : new JsonObject();
                    map = Optional.ofNullable(jsonObject.get(id_break[40])).map(JsonElement::getAsString).filter(string -> !string.isBlank() ? id_throws[15] : id_throws[16]).map(string -> {
                        String string2 = jsonObject.get(id_break[49]).getAsJsonObject().get(id_break[50]).getAsJsonArray().get(id_throws[14]).getAsJsonObject().get(id_break[51]).getAsString();
                        ((Logger)QY.id_break[id_protected[21]]).info(id_break[52], (Object)StringUtils.abbreviateMiddle((String)string, (String)id_break[53], (int)id_byte[5]), (Object)string2);
                        return Map.of(id_break[54], string, id_break[55], string2);
                    }).orElseThrow(() -> {
                        String string;
                        if (jsonObject.has(id_break[44])) {
                            Object[] objectArray = new Object[id_byte[4]];
                            objectArray[rrQf_1.id_throws[12]] = jsonObject.get(id_break[46]).getAsString();
                            objectArray[rrQf_1.id_throws[13]] = jsonObject.get(id_break[47]).getAsString();
                            string = String.format(id_break[45], objectArray);
                        } else {
                            string = id_break[48];
                        }
                        return new Exception(string);
                    });
                    if (closeableHttpClient == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (closeableHttpClient != null) {
                            try {
                                closeableHttpClient.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (InterruptedException interruptedException) {
                        ((Logger)QY.id_break[id_protected[19]]).warn(id_break[41]);
                        throw new CancellationException(id_break[42]);
                    }
                    catch (Exception exception) {
                        ((Logger)QY.id_break[id_protected[20]]).error(id_break[43], (Throwable)exception);
                        throw new CompletionException(exception);
                    }
                }
                closeableHttpClient.close();
            }
            return map;
        }, executor);
    }

    private rrQf_1() {
        throw new UnsupportedOperationException(id_break[0]);
    }

    static {
        rrQf_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x376115C8;
    }

    public static CompletableFuture<String> id_class(Function<Boolean, String> function, Executor executor, @Nullable rrQj_1 rrQj_12) {
        return rrQf_1.id_class(uRI -> rqR_2.id_implements().id_class((URI)uRI), function, executor, rrQj_12);
    }

    public static CompletableFuture<String> id_class(String string, String string2, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            String string4;
            block9: {
                ((Logger)QY.id_break[id_protected[7]]).info(id_break[17]);
                CloseableHttpClient closeableHttpClient = HttpClients.createMinimal();
                try {
                    HttpPost httpPost = new HttpPost(URI.create(id_break[18]));
                    httpPost.setConfig((RequestConfig)id_class[id_protected[8]]);
                    httpPost.setHeader(id_break[19], id_break[20]);
                    Object[] objectArray = new Object[id_byte[1]];
                    objectArray[rrQf_1.id_throws[4]] = string2;
                    objectArray[rrQf_1.id_throws[5]] = string;
                    httpPost.setEntity((HttpEntity)new StringEntity(String.format(id_break[21], objectArray)));
                    ((Logger)QY.id_break[id_protected[9]]).info(id_break[22], (Object)httpPost.getMethod(), (Object)httpPost.getURI().toString(), (Object)(httpPost.getConfig().getConnectTimeout() / id_protected[10]));
                    CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
                    JsonObject jsonObject = new JsonParser().parse(EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity())).getAsJsonObject();
                    string4 = Optional.ofNullable(jsonObject.get(id_break[23])).map(JsonElement::getAsString).filter(string -> !string.isBlank() ? id_throws[8] : id_throws[9]).map(string -> {
                        ((Logger)QY.id_break[id_protected[13]]).info(id_break[32], (Object)StringUtils.abbreviateMiddle((String)string, (String)id_break[33], (int)id_byte[3]));
                        return string;
                    }).orElseThrow(() -> {
                        String string;
                        if (jsonObject.has(id_break[27])) {
                            Object[] objectArray = new Object[id_byte[2]];
                            objectArray[rrQf_1.id_throws[6]] = jsonObject.get(id_break[29]).getAsString();
                            objectArray[rrQf_1.id_throws[7]] = jsonObject.get(id_break[30]).getAsString();
                            string = String.format(id_break[28], objectArray);
                        } else {
                            string = id_break[31];
                        }
                        return new Exception(string);
                    });
                    if (closeableHttpClient == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (closeableHttpClient != null) {
                            try {
                                closeableHttpClient.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (InterruptedException interruptedException) {
                        ((Logger)QY.id_break[id_protected[11]]).warn(id_break[24]);
                        throw new CancellationException(id_break[25]);
                    }
                    catch (Exception exception) {
                        ((Logger)QY.id_break[id_protected[12]]).error(id_break[26], (Throwable)exception);
                        throw new CompletionException(exception);
                    }
                }
                closeableHttpClient.close();
            }
            return string4;
        }, executor);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3050FF8B7D7BD0B0L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{31, -104, -66, -41, 126, 61, 16, -23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static CompletableFuture<String> id_class(Consumer<URI> consumer, Function<Boolean, String> function, Executor executor) {
        return rrQf_1.id_class(consumer, function, executor, null);
    }

    public static CompletableFuture<String> id_class(String string, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            String string3;
            block9: {
                ((Logger)QY.id_break[id_protected[22]]).info(id_break[56]);
                CloseableHttpClient closeableHttpClient = HttpClients.createMinimal();
                try {
                    HttpPost httpPost = new HttpPost(URI.create(id_break[57]));
                    httpPost.setConfig((RequestConfig)id_class[id_protected[23]]);
                    httpPost.setHeader(id_break[58], id_break[59]);
                    Object[] objectArray = new Object[id_throws[17]];
                    objectArray[rrQf_1.id_throws[18]] = string;
                    httpPost.setEntity((HttpEntity)new StringEntity(String.format(id_break[60], objectArray)));
                    ((Logger)QY.id_break[id_protected[24]]).info(id_break[61], (Object)httpPost.getMethod(), (Object)httpPost.getURI().toString(), (Object)(httpPost.getConfig().getConnectTimeout() / id_protected[25]));
                    CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
                    JsonObject jsonObject = closeableHttpResponse.getStatusLine().getStatusCode() == id_protected[26] ? new JsonParser().parse(EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity())).getAsJsonObject() : new JsonObject();
                    string3 = Optional.ofNullable(jsonObject.get(id_break[62])).map(JsonElement::getAsString).filter(string -> !string.isBlank() ? id_throws[21] : id_throws[22]).map(string -> {
                        ((Logger)QY.id_break[id_protected[29]]).info(id_break[71], (Object)StringUtils.abbreviateMiddle((String)string, (String)id_break[72], (int)id_byte[7]));
                        return string;
                    }).orElseThrow(() -> {
                        String string;
                        if (jsonObject.has(id_break[66])) {
                            Object[] objectArray = new Object[id_byte[6]];
                            objectArray[rrQf_1.id_throws[19]] = jsonObject.get(id_break[68]).getAsString();
                            objectArray[rrQf_1.id_throws[20]] = jsonObject.get(id_break[69]).getAsString();
                            string = String.format(id_break[67], objectArray);
                        } else {
                            string = id_break[70];
                        }
                        return new Exception(string);
                    });
                    if (closeableHttpClient == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (closeableHttpClient != null) {
                            try {
                                closeableHttpClient.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (InterruptedException interruptedException) {
                        ((Logger)QY.id_break[id_protected[27]]).warn(id_break[63]);
                        throw new CancellationException(id_break[64]);
                    }
                    catch (Exception exception) {
                        ((Logger)QY.id_break[id_protected[28]]).error(id_break[65], (Throwable)exception);
                        throw new CompletionException(exception);
                    }
                }
                closeableHttpClient.close();
            }
            return string3;
        }, executor);
    }

    private static void id_class() {
        short[] sArray = new short[49];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1000;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[10] = 1000;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[16] = 1;
        sArray[17] = 1000;
        sArray[18] = 200;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[24] = 1;
        sArray[25] = 1000;
        sArray[26] = 200;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[32] = 25585;
        sArray[33] = 1;
        sArray[34] = 1000;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 1;
        sArray[38] = 1;
        sArray[39] = 25585;
        sArray[40] = 1;
        sArray[41] = 1;
        sArray[42] = 1;
        sArray[43] = 1;
        sArray[44] = 1;
        sArray[45] = 200;
        sArray[46] = 30000;
        sArray[47] = 30000;
        sArray[48] = 30000;
        id_protected = sArray;
    }

    public static CompletableFuture<String> id_class(Function<Boolean, String> function, Executor executor) {
        return rrQf_1.id_class((URI uRI) -> rqR_2.id_implements().id_class((URI)uRI), function, executor);
    }

    public static CompletableFuture<String> id_class(Consumer<URI> consumer, Function<Boolean, String> function, Executor executor, @Nullable rrQj_1 rrQj_12) {
        return CompletableFuture.supplyAsync(() -> {
            ((Logger)QY.id_break[id_protected[38]]).info(id_break[97]);
            String string2 = RandomStringUtils.randomAlphanumeric((int)id_byte[10]);
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(id_protected[39]), id_throws[29]);
            CountDownLatch countDownLatch = new CountDownLatch(id_throws[30]);
            AtomicReference<Object> atomicReference = new AtomicReference<Object>(null);
            AtomicReference<Object> atomicReference2 = new AtomicReference<Object>(null);
            httpServer.createContext(id_break[98], httpExchange -> {
                Map<String, String> map = URLEncodedUtils.parse((URI)httpExchange.getRequestURI(), (String)id_break[118]).stream().collect(Collectors.toMap(NameValuePair::getName, NameValuePair::getValue));
                if (!string2.equals(map.get(id_break[119]))) {
                    Object[] objectArray = new Object[id_byte[14]];
                    objectArray[rrQf_1.id_throws[35]] = string2;
                    objectArray[rrQf_1.id_throws[36]] = map.get(id_break[121]);
                    atomicReference2.set(String.format(id_break[120], objectArray));
                } else if (map.containsKey(id_break[122])) {
                    atomicReference.set(map.get(id_break[123]));
                } else if (map.containsKey(id_break[124])) {
                    Object[] objectArray = new Object[id_byte[15]];
                    objectArray[rrQf_1.id_throws[37]] = map.get(id_break[126]);
                    objectArray[rrQf_1.id_throws[38]] = map.get(id_break[127]);
                    atomicReference2.set(String.format(id_break[125], objectArray));
                }
                byte[] byArray = ((String)function.apply(atomicReference2.get() == null ? id_throws[39] : id_throws[40])).getBytes();
                httpExchange.sendResponseHeaders(id_protected[45], byArray.length);
                OutputStream outputStream = httpExchange.getResponseBody();
                outputStream.write(byArray);
                outputStream.close();
                countDownLatch.countDown();
            });
            Object[] objectArray = new Object[id_throws[31]];
            objectArray[rrQf_1.id_throws[32]] = httpServer.getAddress().getPort();
            URIBuilder uRIBuilder = new URIBuilder(id_break[99]).addParameter(id_break[100], id_break[101]).addParameter(id_break[102], id_break[103]).addParameter(id_break[104], String.format(id_break[105], objectArray)).addParameter(id_break[106], id_break[107]).addParameter(id_break[108], string2);
            if (rrQj_12 != null) {
                uRIBuilder.addParameter(id_break[109], rrQj_12.toString());
            }
            URI uRI = uRIBuilder.build();
            ((Logger)QY.id_break[id_protected[40]]).info(id_break[110], (Object)uRI.toString());
            consumer.accept(uRI);
            try {
                ((Logger)QY.id_break[id_protected[41]]).info(id_break[111], (Object)httpServer.getAddress().getPort());
                httpServer.start();
                countDownLatch.await();
                String string3 = Optional.ofNullable(atomicReference.get()).filter(string -> !string.isBlank() ? id_throws[33] : id_throws[34]).map(string -> {
                    ((Logger)QY.id_break[id_protected[44]]).info(id_break[116], (Object)StringUtils.abbreviateMiddle((String)string, (String)id_break[117], (int)id_byte[13]));
                    return string;
                }).orElseThrow(() -> new Exception(Optional.ofNullable((String)atomicReference2.get()).orElse(id_break[115])));
                httpServer.stop(id_byte[11]);
                return string3;
            }
            catch (Throwable throwable) {
                try {
                    httpServer.stop(id_byte[12]);
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    ((Logger)QY.id_break[id_protected[42]]).warn(id_break[112]);
                    throw new CancellationException(id_break[113]);
                }
                catch (Exception exception) {
                    ((Logger)QY.id_break[id_protected[43]]).error(id_break[114], (Throwable)exception);
                    throw new CompletionException(exception);
                }
            }
        }, executor);
    }

    public static CompletableFuture<rqN_2> id_break(String string, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            rqN_2 rqN_22;
            block9: {
                ((Logger)QY.id_break[id_protected[0]]).info(id_break[1]);
                CloseableHttpClient closeableHttpClient = HttpClients.createMinimal();
                try {
                    HttpGet httpGet = new HttpGet(URI.create(id_break[2]));
                    httpGet.setConfig((RequestConfig)id_class[id_protected[1]]);
                    httpGet.setHeader(id_break[3], "Bearer " + string);
                    ((Logger)QY.id_break[id_protected[2]]).info(id_break[4], (Object)httpGet.getMethod(), (Object)httpGet.getURI().toString(), (Object)(httpGet.getConfig().getConnectTimeout() / id_protected[3]));
                    CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpGet);
                    JsonObject jsonObject = new JsonParser().parse(EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity())).getAsJsonObject();
                    rqN_22 = Optional.ofNullable(jsonObject.get(id_break[5])).map(JsonElement::getAsString).filter(string -> !string.isBlank() ? id_throws[2] : id_throws[3]).map(string2 -> {
                        ((Logger)QY.id_break[id_protected[6]]).info(id_break[14], (Object)jsonObject.get(id_break[15]).getAsString(), string2);
                        return new rqN_2(jsonObject.get(id_break[16]).getAsString(), (String)string2, string, rqc_3.MOJANG.name());
                    }).orElseThrow(() -> {
                        String string;
                        if (jsonObject.has(id_break[9])) {
                            Object[] objectArray = new Object[id_byte[0]];
                            objectArray[rrQf_1.id_throws[0]] = jsonObject.get(id_break[11]).getAsString();
                            objectArray[rrQf_1.id_throws[1]] = jsonObject.get(id_break[12]).getAsString();
                            string = String.format(id_break[10], objectArray);
                        } else {
                            string = id_break[13];
                        }
                        return new Exception(string);
                    });
                    if (closeableHttpClient == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (closeableHttpClient != null) {
                            try {
                                closeableHttpClient.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (InterruptedException interruptedException) {
                        ((Logger)QY.id_break[id_protected[4]]).warn(id_break[6]);
                        throw new CancellationException(id_break[7]);
                    }
                    catch (Exception exception) {
                        ((Logger)QY.id_break[id_protected[5]]).error(id_break[8], (Throwable)exception);
                        throw new CompletionException(exception);
                    }
                }
                closeableHttpClient.close();
            }
            return rqN_22;
        }, executor);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[43];
        blArray[1] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[20] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[30] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[36] = true;
        blArray[38] = true;
        blArray[39] = true;
        blArray[42] = true;
        id_throws = blArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{RequestConfig.custom().setConnectionRequestTimeout(30000).setConnectTimeout(30000).setSocketTimeout(30000).build()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQf_1.id_break();
        rrQf_1.id_protected();
        rrQf_1.id_class();
        rrQf_1.id_byte();
        rrQf_1.id_throws();
    }

    public static CompletableFuture<String> id_protected(String string, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            String string3;
            block9: {
                ((Logger)QY.id_break[id_protected[30]]).info(id_break[73]);
                CloseableHttpClient closeableHttpClient = HttpClients.createMinimal();
                try {
                    HttpPost httpPost = new HttpPost(URI.create(id_break[74]));
                    httpPost.setConfig((RequestConfig)id_class[id_protected[31]]);
                    httpPost.setHeader(id_break[75], id_break[76]);
                    Object[] objectArray = new Object[id_throws[23]];
                    objectArray[rrQf_1.id_throws[24]] = (int)id_protected[32];
                    httpPost.setEntity((HttpEntity)new UrlEncodedFormEntity(List.of(new BasicNameValuePair(id_break[77], id_break[78]), new BasicNameValuePair(id_break[79], id_break[80]), new BasicNameValuePair(id_break[81], string), new BasicNameValuePair(id_break[82], String.format(id_break[83], objectArray))), id_break[84]));
                    ((Logger)QY.id_break[id_protected[33]]).info(id_break[85], (Object)httpPost.getMethod(), (Object)httpPost.getURI().toString(), (Object)(httpPost.getConfig().getConnectTimeout() / id_protected[34]));
                    CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute((HttpUriRequest)httpPost);
                    JsonObject jsonObject = new JsonParser().parse(EntityUtils.toString((HttpEntity)closeableHttpResponse.getEntity())).getAsJsonObject();
                    string3 = Optional.ofNullable(jsonObject.get(id_break[86])).map(JsonElement::getAsString).filter(string -> !string.isBlank() ? id_throws[27] : id_throws[28]).map(string -> {
                        ((Logger)QY.id_break[id_protected[37]]).info(id_break[95], (Object)StringUtils.abbreviateMiddle((String)string, (String)id_break[96], (int)id_byte[9]));
                        return string;
                    }).orElseThrow(() -> {
                        String string;
                        if (jsonObject.has(id_break[90])) {
                            Object[] objectArray = new Object[id_byte[8]];
                            objectArray[rrQf_1.id_throws[25]] = jsonObject.get(id_break[92]).getAsString();
                            objectArray[rrQf_1.id_throws[26]] = jsonObject.get(id_break[93]).getAsString();
                            string = String.format(id_break[91], objectArray);
                        } else {
                            string = id_break[94];
                        }
                        return new Exception(string);
                    });
                    if (closeableHttpClient == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (closeableHttpClient != null) {
                            try {
                                closeableHttpClient.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (InterruptedException interruptedException) {
                        ((Logger)QY.id_break[id_protected[35]]).warn(id_break[87]);
                        throw new CancellationException(id_break[88]);
                    }
                    catch (Exception exception) {
                        ((Logger)QY.id_break[id_protected[36]]).error(id_break[89], (Throwable)exception);
                        throw new CompletionException(exception);
                    }
                }
                closeableHttpClient.close();
            }
            return string3;
        }, executor);
    }

    private static void id_protected() {
        id_break = new String[]{new String("This is a utility class and cannot be instantiated"), new String("Fetching Minecraft profile..."), new String("https://api.minecraftservices.com/minecraft/profile"), new String("Authorization"), new String("[{}] {} (timeout={}s)"), new String("id"), new String("Minecraft profile fetching was cancelled!"), new String("Interrupted"), new String("Unable to fetch Minecraft profile!"), new String("error"), new String("%s: %s"), new String("error"), new String("errorMessage"), new String("There was no profile or error description present."), new String("Fetched Minecraft profile! (name={}, uuid={})"), new String("name"), new String("name"), new String("Exchanging Xbox Live XSTS token for a Minecraft access token..."), new String("https://api.minecraftservices.com/authentication/login_with_xbox"), new String("Content-Type"), new String("application/json"), new String("{\"identityToken\": \"XBL3.0 x=%s;%s\"}"), new String("[{}] {} (timeout={}s)"), new String("access_token"), new String("Minecraft access token acquisition was cancelled!"), new String("Interrupted"), new String("Unable to acquire Minecraft access token!"), new String("error"), new String("%s: %s"), new String("error"), new String("errorMessage"), new String("There was no access token or error description present."), new String("Acquired Minecraft access token! ({})"), new String("..."), new String("Exchanging Xbox Live token for an Xbox Live XSTS token..."), new String("https://xsts.auth.xboxlive.com/xsts/authorize"), new String("Content-Type"), new String("application/json"), new String("{\n  \"Properties\": {\n    \"SandboxId\": \"RETAIL\",\n    \"UserTokens\": [\"%s\"]\n  },\n  \"RelyingParty\": \"rp://api.minecraftservices.com/\",\n  \"TokenType\": \"JWT\"\n}"), new String("[{}] {} (timeout={}s)"), new String("Token"), new String("Xbox Live XSTS token acquisition was cancelled!"), new String("Interrupted"), new String("Unable to acquire Xbox Live XSTS token!"), new String("XErr"), new String("%s: %s"), new String("XErr"), new String("Message"), new String("There was no access token or error description present."), new String("DisplayClaims"), new String("xui"), new String("uhs"), new String("Acquired Xbox Live XSTS token! (token={}, uhs={})"), new String("..."), new String("Token"), new String("uhs"), new String("Exchanging Microsoft access token for an Xbox Live access token..."), new String("https://user.auth.xboxlive.com/user/authenticate"), new String("Content-Type"), new String("application/json"), new String("{\n  \"Properties\": {\n    \"AuthMethod\": \"RPS\",\n    \"SiteName\": \"user.auth.xboxlive.com\",\n    \"RpsTicket\": \"d=%s\"\n  },\n  \"RelyingParty\": \"http://auth.xboxlive.com\",\n  \"TokenType\": \"JWT\"\n}"), new String("[{}] {} (timeout={}s)"), new String("Token"), new String("Xbox Live access token acquisition was cancelled!"), new String("Interrupted"), new String("Unable to acquire Xbox Live access token!"), new String("XErr"), new String("%s: %s"), new String("XErr"), new String("Message"), new String("There was no access token or error description present."), new String("Acquired Xbox Live access token! ({})"), new String("..."), new String("Exchanging Microsoft auth code for an access token..."), new String("https://login.microsoftonline.com/consumers/oauth2/v2.0/token"), new String("Content-Type"), new String("application/x-www-form-urlencoded"), new String("client_id"), new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"), new String("grant_type"), new String("authorization_code"), new String("code"), new String("redirect_uri"), new String("http://localhost:%d/callback"), new String("UTF-8"), new String("[{}] {} (timeout={}s)"), new String("access_token"), new String("Microsoft access token acquisition was cancelled!"), new String("Interrupted"), new String("Unable to acquire Microsoft access token!"), new String("error"), new String("%s: %s"), new String("error"), new String("error_description"), new String("There was no access token or error description present."), new String("Acquired Microsoft access token! ({})"), new String("..."), new String("Acquiring Microsoft auth code..."), new String("/callback"), new String("https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize"), new String("client_id"), new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"), new String("response_type"), new String("code"), new String("redirect_uri"), new String("http://localhost:%d/callback"), new String("scope"), new String("XboxLive.signin offline_access"), new String("state"), new String("prompt"), new String("Launching Microsoft login in browser: {}"), new String("Begin listening on http://localhost:{}/callback for a successful Microsoft login..."), new String("Microsoft auth code acquisition was cancelled!"), new String("Interrupted"), new String("Unable to acquire Microsoft auth code!"), new String("There was no auth code or error description present."), new String("Acquired Microsoft auth code! ({})"), new String("..."), new String("UTF-8"), new String("state"), new String("State mismatch! Expected '%s' but got '%s'."), new String("state"), new String("code"), new String("code"), new String("error"), new String("%s: %s"), new String("error"), new String("error_description")};
    }
}

