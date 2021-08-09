package com.pathlock.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pathlock.demo.dao.AdapterRepository;
import com.pathlock.demo.dao.ApiFMapRepository;
import com.pathlock.demo.dao.ApiFieldsRepository;
import com.pathlock.demo.dao.ApiPMapRepository;
import com.pathlock.demo.dao.ApiParamRepository;
import com.pathlock.demo.dao.AppAdapterRepository;
import com.pathlock.demo.dao.AppSystemRepository;
import com.pathlock.demo.dao.ApplicationRepository;
import com.pathlock.demo.dao.BatchDataRepository;
import com.pathlock.demo.dao.BatchHeaderRepository;
import com.pathlock.demo.dao.BatchRunRepository;
import com.pathlock.demo.dao.BatchScheduleRepository;
import com.pathlock.demo.dao.ConnFieldRepository;
import com.pathlock.demo.dao.ConnTypesRepository;
import com.pathlock.demo.dao.ConnectorRepository;
import com.pathlock.demo.dao.ProgramApiRepository;
import com.pathlock.demo.dao.ProgramApiSysRepository;
import com.pathlock.demo.dao.ProgramAssociationRepository;
import com.pathlock.demo.dao.ProgramDetailRepository;
import com.pathlock.demo.dao.ProgramFMapRepository;
import com.pathlock.demo.dao.ProgramFieldRepository;
import com.pathlock.demo.dao.ProgramMMapRepository;
import com.pathlock.demo.dao.ProgramParamRepository;
import com.pathlock.demo.dao.ProgramRepository;
import com.pathlock.demo.dao.ProgramTypesRepository;
import com.pathlock.demo.dao.PropertiesRepository;
import com.pathlock.demo.dao.RegistersRepository;
import com.pathlock.demo.dao.RegistrationStatusRepository;
import com.pathlock.demo.dao.SequenceRepository;
import com.pathlock.demo.dao.SodConfigRepository;
import com.pathlock.demo.dao.SystemConnectionRepository;
import com.pathlock.demo.dao.SystemParamRepository;
import com.pathlock.demo.dao.SystemRepository;
import com.pathlock.demo.dao.UserRepository;
import com.pathlock.demo.dao.XpaApiRepository;
import com.pathlock.demo.dao.XpaAuditDRepository;
import com.pathlock.demo.dao.XpaAuditHRepository;
import com.pathlock.demo.dao.XpaIeFieldRepository;
import com.pathlock.demo.dao.XpaIeFileRepository;
import com.pathlock.demo.dao.XpaIeProfsRepository;
import com.pathlock.demo.dao.XpaImpDataRepository;
import com.pathlock.demo.dao.XpaJobRepository;
import com.pathlock.demo.dao.XpaKeyRepository;
import com.pathlock.demo.dao.XpaPlatformRepository;
import com.pathlock.demo.dao.XpaSettingRepository;
import com.pathlock.demo.dao.XpaSodDataRepository;
import com.pathlock.demo.dao.XpaSodIDataRepository;
import com.pathlock.demo.entity.Adapter;
import com.pathlock.demo.entity.ApiFMap;
import com.pathlock.demo.entity.ApiFields;
import com.pathlock.demo.entity.ApiPMap;
import com.pathlock.demo.entity.ApiParam;
import com.pathlock.demo.entity.AppAdapter;
import com.pathlock.demo.entity.AppSystem;
import com.pathlock.demo.entity.Application;
import com.pathlock.demo.entity.BatchData;
import com.pathlock.demo.entity.BatchHeader;
import com.pathlock.demo.entity.BatchRuns;
import com.pathlock.demo.entity.BatchSchedule;
import com.pathlock.demo.entity.ConnField;
import com.pathlock.demo.entity.ConnTypes;
import com.pathlock.demo.entity.Connector;
import com.pathlock.demo.entity.GltSystem;
import com.pathlock.demo.entity.Program;
import com.pathlock.demo.entity.ProgramApi;
import com.pathlock.demo.entity.ProgramApiSys;
import com.pathlock.demo.entity.ProgramAssociation;
import com.pathlock.demo.entity.ProgramDetail;
import com.pathlock.demo.entity.ProgramFMap;
import com.pathlock.demo.entity.ProgramField;
import com.pathlock.demo.entity.ProgramMMap;
import com.pathlock.demo.entity.ProgramParam;
import com.pathlock.demo.entity.ProgramTypes;
import com.pathlock.demo.entity.Properties;
import com.pathlock.demo.entity.Registers;
import com.pathlock.demo.entity.RegistrationStatus;
import com.pathlock.demo.entity.Sequence;
import com.pathlock.demo.entity.SodConfig;
import com.pathlock.demo.entity.SystemConnection;
import com.pathlock.demo.entity.SystemParam;
import com.pathlock.demo.entity.User;
import com.pathlock.demo.entity.XpaApi;
import com.pathlock.demo.entity.XpaAuditD;
import com.pathlock.demo.entity.XpaAuditH;
import com.pathlock.demo.entity.XpaIeField;
import com.pathlock.demo.entity.XpaIeFile;
import com.pathlock.demo.entity.XpaIeProfs;
import com.pathlock.demo.entity.XpaImpData;
import com.pathlock.demo.entity.XpaJob;
import com.pathlock.demo.entity.XpaKeys;
import com.pathlock.demo.entity.XpaPlatform;
import com.pathlock.demo.entity.XpaSetting;
import com.pathlock.demo.entity.XpaSodData;
import com.pathlock.demo.entity.XpaSodIData;

@RestController
public class RtadsController {

	private static final String template = "Hello, hhHow are you %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired // This means to get the bean called userRepository
	// Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;
	
	@Autowired
	private ConnectorRepository connectorRepository;
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Autowired
	private SystemRepository systemRepository;
	
	@Autowired
	private BatchDataRepository batchDataRepository;
	
	@Autowired
	private BatchHeaderRepository batchHeaderRepository;
	
	@Autowired
	private BatchRunRepository batchRunRepository;
	
	@Autowired
	private BatchScheduleRepository batchScheduleRepository;
	
	@Autowired
	private AdapterRepository adapterRepository;
	
	@Autowired
	private ApiFMapRepository apiFMapRepository;
	
	@Autowired
	private ApiFieldsRepository apiFieldsRepository;
	
	@Autowired
	private ApiPMapRepository apiPMapRepository;
	
	@Autowired
	private ApiParamRepository apiParamRepository;
	
	@Autowired
	private XpaApiRepository xpaApiRepository;
	
	@Autowired
	private ConnFieldRepository connFieldRepository;
	
	@Autowired
	private ConnTypesRepository connTypesRepository;
	
	@Autowired
	private ProgramApiSysRepository programApiSysRepository;
	
	@Autowired
	private ProgramApiRepository programApiRepository;
	
	@Autowired
	private ProgramAssociationRepository programAssociationRepository;
	
	@Autowired
	private ProgramDetailRepository programDetailRepository;
	
	@Autowired
	private ProgramFMapRepository programFMapRepository;
	
	@Autowired
	private ProgramFieldRepository programFieldRepository;
	
	@Autowired
	private ProgramMMapRepository programMMapRepository;
	
	@Autowired
	private ProgramParamRepository programParamRepository;
	
	@Autowired
	private ProgramTypesRepository programTypesRepository;
	
	@Autowired
	private ProgramRepository programRepository;
	
	@Autowired
	private PropertiesRepository propertiesRepository;
	
	@Autowired
	private RegistrationStatusRepository registrationStatusRepository;
	
	@Autowired
	private RegistersRepository registersRepository;
	
	@Autowired
	private SequenceRepository sequenceRepository;
	
	@Autowired
	private SystemConnectionRepository systemConnectionRepository;
	
	@Autowired
	private SystemParamRepository systemParamRepository;
	
	@Autowired
	private AppAdapterRepository appsAdapterRespository;
	
	@Autowired
	private AppSystemRepository appsSystemRepository;
	
	@Autowired
	private XpaJobRepository xpaJobRepository;
	
	@Autowired
	private XpaKeyRepository xpaKeyRepository;
	
	@Autowired
	private XpaPlatformRepository xpaPlatformRepository;
	
	@Autowired
	private XpaSettingRepository xpaSettingRepository;
	
	@Autowired
	private SodConfigRepository sodConfigRepository;
	
	@Autowired
	private XpaSodIDataRepository xpaSodIDataRepository;
	
	@Autowired
	private XpaAuditDRepository xpaAuditDRepository;
	
	@Autowired
	private XpaAuditHRepository xpaAuditHRepository;
	
	@Autowired
	private XpaSodDataRepository xpaSodDataRepository;
	
	@Autowired
	private XpaImpDataRepository xpaImpDataRepository;
	
	@Autowired
	private XpaIeProfsRepository xpaIeProfsRepository;
	
	@Autowired
	private XpaIeFileRepository xpaIeFileRepository;
	
	@Autowired
	private XpaIeFieldRepository xpaIeFieldRepository;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/allUsers")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}

	@GetMapping(path = "/allConnectors")
	public @ResponseBody Iterable<Connector> getAllConnectors() {
		// This returns a JSON or XML with the users
		return connectorRepository.findAll();
	}

	@GetMapping(path = "/allApplications")
	public @ResponseBody Iterable<Application> getAllApplications() {
		// This returns a JSON or XML with the users
		return applicationRepository.findAll();
	}

	@GetMapping(path = "/allSystems")
	public @ResponseBody Iterable<GltSystem> getAllSystems() {
		// This returns a JSON or XML with the users
		return systemRepository.findAll();
	}

	@GetMapping(path = "/allBatchD")
	public @ResponseBody Iterable<BatchData> getAllBatchData() {
		// This returns a JSON or XML with the users
		return batchDataRepository.findAll();
	}

	@GetMapping(path = "/allBatchH")
	public @ResponseBody Iterable<BatchHeader> getAllBatchHeaders() {
		// This returns a JSON or XML with the users
		return batchHeaderRepository.findAll();
	}

	@GetMapping(path = "/allBatchRuns")
	public @ResponseBody Iterable<BatchRuns> getAllBatchRuns() {
		// This returns a JSON or XML with the users
		return batchRunRepository.findAll();
	}

	@GetMapping(path = "/allBatchSchedule")
	public @ResponseBody Iterable<BatchSchedule> getAllBatchSchedule() {
		// This returns a JSON or XML with the users
		return batchScheduleRepository.findAll();
	}

	@GetMapping(path = "/allSystemParam")
	public @ResponseBody Iterable<SystemParam> getAllSystemParams() {
		// This returns a JSON or XML with the users
		System.out.println("test");
		Iterable<SystemParam> data = systemParamRepository.findAll();
		System.out.println("test");
		return data;
	}

	@GetMapping(path = "/allSystemConnection")
	public @ResponseBody Iterable<SystemConnection> getSystemConnection() {
		// This returns a JSON or XML with the users
		return systemConnectionRepository.findAll();
	}

	@GetMapping(path = "/allSequence")
	public @ResponseBody Iterable<Sequence> getAllSequence() {
		// This returns a JSON or XML with the users
		return sequenceRepository.findAll();
	}

	@GetMapping(path = "/allRegisters")
	public @ResponseBody Iterable<Registers> getAllRegisters() {
		// This returns a JSON or XML with the users
		return registersRepository.findAll();
	}

	@GetMapping(path = "/allRegistrationStatus")
	public @ResponseBody Iterable<RegistrationStatus> getAllRegistrationStatus() {
		// This returns a JSON or XML with the users
		return registrationStatusRepository.findAll();
	}

	@GetMapping(path = "/allProperties")
	public @ResponseBody Iterable<Properties> getAllProperties() {
		// This returns a JSON or XML with the users
		return propertiesRepository.findAll();
	}

	@GetMapping(path = "/allProgram")
	public @ResponseBody Iterable<Program> getAllProgram() {
		// This returns a JSON or XML with the users
		return programRepository.findAll();
	}

	@GetMapping(path = "/allProgramTypes")
	public @ResponseBody Iterable<ProgramTypes> getAllProgramTypes() {
		// This returns a JSON or XML with the users
		return programTypesRepository.findAll();
	}

	@GetMapping(path = "/allProgramParam")
	public @ResponseBody Iterable<ProgramParam> getAllProgramParam() {
		// This returns a JSON or XML with the users
		return programParamRepository.findAll();
	}

	@GetMapping(path = "/allProgramMMap")
	public @ResponseBody Iterable<ProgramMMap> getAllProgramMMap() {
		// This returns a JSON or XML with the users
		return programMMapRepository.findAll();
	}

	@GetMapping(path = "/allProgramField")
	public @ResponseBody Iterable<ProgramField> getAllProgramField() {
		// This returns a JSON or XML with the users
		return programFieldRepository.findAll();
	}

	@GetMapping(path = "/allProgramFMap")
	public @ResponseBody Iterable<ProgramFMap> getAllProgramFMap() {
		// This returns a JSON or XML with the users
		return programFMapRepository.findAll();
	}

	@GetMapping(path = "/allProgramDetail")
	public @ResponseBody Iterable<ProgramDetail> getAllProgramDetail() {
		// This returns a JSON or XML with the users
		return programDetailRepository.findAll();
	}

	@GetMapping(path = "/allProgramAssociation")
	public @ResponseBody Iterable<ProgramAssociation> getAllProgramAssociation() {
		// This returns a JSON or XML with the users
		return programAssociationRepository.findAll();
	}

	@GetMapping(path = "/allProgramApi")
	public @ResponseBody Iterable<ProgramApi> getAllProgramApi() {
		// This returns a JSON or XML with the users
		return programApiRepository.findAll();
	}

	@GetMapping(path = "/allProgramApiSys")
	public @ResponseBody Iterable<ProgramApiSys> getAllProgramApiSys() {
		// This returns a JSON or XML with the users
		return programApiSysRepository.findAll();
	}

	@GetMapping(path = "/allConnTypes")
	public @ResponseBody Iterable<ConnTypes> getAllConnTypes() {
		// This returns a JSON or XML with the users
		return connTypesRepository.findAll();
	}

	@GetMapping(path = "/allConnField")
	public @ResponseBody Iterable<ConnField> getAllConnField() {
		// This returns a JSON or XML with the users
		return connFieldRepository.findAll();
	}

	@GetMapping(path = "/allAdapter")
	public @ResponseBody Iterable<Adapter> getAllAdapter() {
		// This returns a JSON or XML with the users
		return adapterRepository.findAll();
	}

	@GetMapping(path = "/allXpaApi")
	public @ResponseBody Iterable<XpaApi> getAllXpaApi() {
		// This returns a JSON or XML with the users
		return xpaApiRepository.findAll();
	}

	@GetMapping(path = "/allAPiParam")
	public @ResponseBody Iterable<ApiParam> getAllAPiParam() {
		// This returns a JSON or XML with the users
		return apiParamRepository.findAll();
	}


	
	
	@GetMapping(path = "/allapiFMap")
	public @ResponseBody Iterable<ApiFMap> getAllapiFMap() {
		// This returns a JSON or XML with the users
		return apiFMapRepository.findAll();
	}
	
	@GetMapping(path = "/allApiPMap")
	public @ResponseBody Iterable<ApiPMap> getAllApiPMap() {
		// This returns a JSON or XML with the users
		return apiPMapRepository.findAll();
	}

	@GetMapping(path = "/allApiFields")
	public @ResponseBody Iterable<ApiFields> getAllApiFields() {
		// This returns a JSON or XML with the users
		return apiFieldsRepository.findAll();
	}

	@GetMapping(path = "/allAppAdapter")
	public @ResponseBody Iterable<AppAdapter> getAllAppAdapter() {
		// This returns a JSON or XML with the users
		return appsAdapterRespository.findAll();
	}

	@GetMapping(path = "/allAppSystem")
	public @ResponseBody Iterable<AppSystem> getAllAppSystem() {
		// This returns a JSON or XML with the users
		return appsSystemRepository.findAll();
	}

	@GetMapping(path = "/allXpaJob")
	public @ResponseBody Iterable<XpaJob> getAllXpaJobs() {
		// This returns a JSON or XML with the users
		return xpaJobRepository.findAll();
	}

	@GetMapping(path = "/allXpaKeys")
	public @ResponseBody Iterable<XpaKeys> getAllXpaKeys() {
		// This returns a JSON or XML with the users
		return xpaKeyRepository.findAll();
	}

	@GetMapping(path = "/allXpaPlatforms")
	public @ResponseBody Iterable<XpaPlatform> getAllXpaPlatforms() {
		// This returns a JSON or XML with the users
		return xpaPlatformRepository.findAll();
	}

	@GetMapping(path = "/allXpaSettings")
	public @ResponseBody Iterable<XpaSetting> getAllXpaSettings() {
		// This returns a JSON or XML with the users
		return xpaSettingRepository.findAll();
	}

	@GetMapping(path = "/allSodConfig")
	public @ResponseBody Iterable<SodConfig> getAllSodConfig() {
		// This returns a JSON or XML with the users
		return sodConfigRepository.findAll();
	}

	@GetMapping(path = "/allXpaIeField")
	public @ResponseBody Iterable<XpaIeField> getAllXpaIeField() {
		// This returns a JSON or XML with the users
		return xpaIeFieldRepository.findAll();
	}

	@GetMapping(path = "/allXpaIeFile")
	public @ResponseBody Iterable<XpaIeFile> getAllXpaIeFile() {
		// This returns a JSON or XML with the users
		return xpaIeFileRepository.findAll();
	}

	@GetMapping(path = "/allXpaIeProfs")
	public @ResponseBody Iterable<XpaIeProfs> getAllXpaProfs() {
		// This returns a JSON or XML with the users
		return xpaIeProfsRepository.findAll();
	}

	@GetMapping(path = "/allXpaImpData")
	public @ResponseBody Iterable<XpaImpData> getAllXpaImpData() {
		// This returns a JSON or XML with the users
		return xpaImpDataRepository.findAll();
	}

	@GetMapping(path = "/allXpaSodData")
	public @ResponseBody Iterable<XpaSodData> getAllXpaSodData() {
		// This returns a JSON or XML with the users
		return xpaSodDataRepository.findAll();
	}

	@GetMapping(path = "/allXpaSodIData")
	public @ResponseBody Iterable<XpaSodIData> getAllXpaSodIData() {
		// This returns a JSON or XML with the users
		return xpaSodIDataRepository.findAll();
	}

	@GetMapping(path = "/allXpaAuditH")
	public @ResponseBody Iterable<XpaAuditH> getAllXpaAuditH() {
		// This returns a JSON or XML with the users
		return xpaAuditHRepository.findAll();
	}

	@GetMapping(path = "/allXpaAuditD")
	public @ResponseBody Iterable<XpaAuditD> getAllXpaAuditD() {
		// This returns a JSON or XML with the users
		return xpaAuditDRepository.findAll();
	}
}