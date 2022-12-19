package com.bus;

import org.apache.solr.client.solrj.impl.Http2SolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSolrBusApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringSolrBusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		String urlString = "http://localhost:8983/solr/bus";
		Http2SolrClient solr = new Http2SolrClient.Builder(urlString).build();
		solr.setParser(new XMLResponseParser());

		SolrInputDocument document = new SolrInputDocument();
		document.addField("busId", 1);
		document.addField("busServiceNum", 657);
		document.addField("busPlateNum", "AP02 RJ 2065");
		solr.add(document);
		solr.commit();
	}

}
